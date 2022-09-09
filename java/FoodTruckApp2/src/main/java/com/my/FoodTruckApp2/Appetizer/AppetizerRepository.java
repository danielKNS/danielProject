package com.my.FoodTruckApp2.Appetizer;

import com.my.FoodTruckApp2.Customer.Customer;
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class AppetizerRepository {
   private final JdbcTemplate jdbcTemplate;

    //   ----------- INSERTING A NEW APPETIZER -----------  //
    public Appetizer creatingNewAppetizer(@RequestBody AppetizerRequestBody appetizerRequestBody){
        String sql = "INSERT INTO appetizer(name,date,expire_date,price) VALUES(?,?,?,?) RETURNING *";
        Appetizer appetizer = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Appetizer.class),
                appetizerRequestBody.getAppetizerName(),
                appetizerRequestBody.getDate(),
                appetizerRequestBody.getExpireDate(),
                appetizerRequestBody.getPrice());
        log.info("new appetizer AVAILABLE!!!! ");
        return appetizer;
    }
    // ---------GETTING APPETIZER BY THEIR ID----------//
    public Appetizer gettingAppetizerById(@PathVariable Integer id){
        String sql = "SELECT * FROM appetizer WHERE id = ?";
        try {
            Appetizer appetizer = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Appetizer.class),id);
            log.info("Found the appetizer with the id: " + id);
                return appetizer;
        }catch (EmptyResultDataAccessException emptyResultDataAccessException){
            log.error("This id: " +id + " does NOT EXIST");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    // -----------GETTING ALL APPETIZER------------ //
    public List<Appetizer> gettingALlAppetizer(){
        String sql = "Select * FROM appetizer";
        List<Appetizer> appetizerList = jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Appetizer.class));
        return appetizerList;
    }
    // ----------- DELETING APPETIZER BY THEIR ID -------------//
    public void deleteAppetizerById(@PathVariable Integer id ){
        String sql = "SELECT * FROM appetizer WHERE id = ?";
        String sqlDelete = "DELETE FROM appetizer WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Appetizer.class),id);
            log.info("Appetizer has been Deleted!! ID: " + id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException){
            log.error("THIS ID:" + id + "DOES NOT EXIST");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"This ID: " + id + "does NOT EXIST!!!!!");
        }
        jdbcTemplate.update(sqlDelete,id);
    }
}
