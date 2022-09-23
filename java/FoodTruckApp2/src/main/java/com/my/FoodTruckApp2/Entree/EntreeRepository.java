package com.my.FoodTruckApp2.Entree;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class EntreeRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * ----------- INSERTING A NEW ENTREE -----------
     **/
    public Entree createNewEntree(EntreeRequestBody entreeRequestBody) {
        String sql = "INSERT INTO entree(name,price) VALUES (?,?) RETURNING *";
        Entree entree = jdbcTemplate.queryForObject(sql,
                new BeanPropertyRowMapper<>(Entree.class),
                entreeRequestBody.getEntreeName(),
                entreeRequestBody.getEntreePrice());
        log.info("New entree is AVAILABLE!!!");
        return entree;
    }

    /**
     * ---------GETTING ENTREE BY THEIR ID----------
     **/
    public Entree gettingEntreeById(Integer id) {
        String sql = "SELECT * FROM entree WHERE id = ?";
        try {
            Entree entree = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Entree.class), id);
            log.info("Found the entree with the id: " + id);
            return entree;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("this entree id: " + id + " does NOT EXIST!!!");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * -----------GETTING ALL ENTREE(DATABASE)------------
     **/
    public List<Entree> gettingAllEntree() {
        String sql = "SELECT * FROM entree";
        List<Entree> entreList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Entree.class));
        log.info("ALL entrees are AVAILABLE!!!");
        return entreList;
    }

    /**
     * ----------- DELETING ENTREE BY THEIR ID -------------
     **/
    public void deleteEntreeById(Integer id) {
        String sql = "SELECT * FROM entree WHERE id = ?";
        String deleteSql = "DELETE FROM entree WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Entree.class), id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("this entree id: " + id + " does NOT EXIST!!!");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        log.info("id: " + id + " Entree has been DELETED!!! ");
        jdbcTemplate.update(deleteSql, id);
    }


    /**
     * ----------- CREATE ENTREE ORDERS -------------
     **/
    public void createEntreeOrders(Integer orderId, List<Integer> entreeIds) {

        String sqlEntree = "INSERT INTO entree_ordered(order_id ,entree_id) VALUES (?,?)";

        jdbcTemplate.batchUpdate(
                sqlEntree,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, orderId);
                        ps.setInt(2, entreeIds.get(i));

                    }

                    @Override
                    public int getBatchSize() {
                        return entreeIds.size();
                    }
                }
        );
    }

    public List<Entree> gettingAllEntreesByIds(List<Integer> entreeIds) {
        String sql = "SELECT * FROM entree WHERE id in (:ids)";
        MapSqlParameterSource parameter = new MapSqlParameterSource();

        parameter.addValue("ids", entreeIds);

        List<Entree> entrees = namedParameterJdbcTemplate.query(sql, parameter, new BeanPropertyRowMapper<>(Entree.class));
        log.info("Found the entrees: " + entrees);

        return entrees;

    }
}