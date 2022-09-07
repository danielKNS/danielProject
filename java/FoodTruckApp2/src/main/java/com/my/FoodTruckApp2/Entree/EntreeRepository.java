package com.my.FoodTruckApp2.Entree;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class EntreeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //   ----------- INSERTING A NEW ENTREE -----------  //
    public Entree createNewEntree(@RequestBody EntreeRequestBody entreeRequestBody){
        String sql = "INSERT INTO entree(name,price) VALUES (?,?) RETURNING *";
        Entree entree = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Entree.class),
                entreeRequestBody.getEntreeName(),
                entreeRequestBody.getEntreePrice());
        log.info("New entree is AVAILABLE!!!");
        return entree;
    }

    // ---------GETTING ENTREE BY THEIR ID----------//
    public Entree gettingEntreeById(@PathVariable Integer id){
        String sql ="SELECT * FROM entree WHERE id = ?";
        try{
           Entree entree = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Entree.class),id);
           log.info("Found the entree with the id: " + id);
           return entree;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException){
            log.error("this entree id: " + id + " does NOT EXIST!!!");
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    // -----------GETTING ALL ENTREE(DATABASE)------------ //
    public List<Entree> gettingAllEntree(){
        String sql = "SELECT * FROM entree";
        List<Entree> entreList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Entree.class));
        log.info("ALL entrees are AVAILABLE!!!");
        return entreList;
    }
    // ----------- DELETING ENTREE BY THEIR ID -------------//
    public void deleteEntreeById(@PathVariable Integer id){
        String sql = "SELECT * FROM entree WHERE id = ?";
        String deleteSql = "DELETE FROM entree WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Entree.class),id);
        }catch (EmptyResultDataAccessException emptyResultDataAccessException){
            log.error("this entree id: " + id + " does NOT EXIST!!!");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        log.info("id: " + id + " Entree has been DELETED!!! ");
        jdbcTemplate.update(deleteSql,id);
    }
}