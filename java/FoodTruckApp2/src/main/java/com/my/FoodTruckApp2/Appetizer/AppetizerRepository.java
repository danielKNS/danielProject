package com.my.FoodTruckApp2.Appetizer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
public class AppetizerRepository {
    private final JdbcTemplate jdbcTemplate;
    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    /**
     * ----------- INSERTING A NEW APPETIZER -----------
     **/
    public Appetizer creatingNewAppetizer(AppetizerRequestBody appetizerRequestBody) {
        String sql = "INSERT INTO appetizer(name,date,expire_date,price) VALUES(?,?,?,?) RETURNING *";
        Appetizer appetizer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Appetizer.class),
                appetizerRequestBody.getAppetizerName(),
                appetizerRequestBody.getDate(),
                appetizerRequestBody.getExpireDate(),
                appetizerRequestBody.getPrice());
        log.info("new appetizer AVAILABLE!!!! ");
        return appetizer;
    }

    /**
     * ---------GETTING APPETIZER BY THEIR ID----------
     **/
    public Appetizer gettingAppetizerById(Integer id) {
        String sql = "SELECT * FROM appetizer WHERE id = ?";
        try {
            Appetizer appetizer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Appetizer.class), id);
            log.info("Found the appetizer with the id: " + id);
            return appetizer;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("This id: " + id + " does NOT EXIST");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * -----------GETTING ALL APPETIZER------------
     **/
    public List<Appetizer> gettingALlAppetizer() {
        String sql = "Select * FROM appetizer";
        List<Appetizer> appetizerList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Appetizer.class));
        return appetizerList;
    }

    /**
     * ----------- DELETING APPETIZER BY THEIR ID -------------
     **/
    public void deleteAppetizerById(Integer id) {
        String sql = "SELECT * FROM appetizer WHERE id = ?";
        String sqlDelete = "DELETE FROM appetizer WHERE id = ?";
        try {
            jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Appetizer.class), id);
            log.info("Appetizer has been Deleted!! ID: " + id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("THIS ID:" + id + "DOES NOT EXIST");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This ID: " + id + "does NOT EXIST!!!!!");
        }
        jdbcTemplate.update(sqlDelete, id);
    }

    /**
     * ----------- CREATE APPETIZER ORDERS -------------
     **/
    public void createAppetizerOrders(Integer orderId, List<Integer> appetizerIds) {

        String sqlAppetizer = " INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?)";

        jdbcTemplate.batchUpdate(
                sqlAppetizer,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, orderId);
                        ps.setInt(2, appetizerIds.get(i));

                    }

                    @Override
                    public int getBatchSize() {
                        return appetizerIds.size();
                    }
                }
        );
    }

    public List<Appetizer> gettingAllAppetizersByIds(List<Integer> appetizerIds) {
        String sql = "SELECT * FROM appetizer WHERE id in (:ids)";
        MapSqlParameterSource parameter = new MapSqlParameterSource();

        parameter.addValue("ids", appetizerIds);

        List<Appetizer> appetizers = namedParameterJdbcTemplate.query(sql, parameter, new BeanPropertyRowMapper<>(Appetizer.class));
        log.info("Found the appetizers: " + appetizers);

        return appetizers;

    }

    public List<Appetizer> findAppetizersOrderById(Integer id) {
        log.info("looking getting order by id: " + id);
        String sql = "SELECT appetizer.* " +
                "FROM appetizer " +
                "JOIN appetizer_ordered ON appetizer.id = appetizer_ordered.appetizer_id " +
                "WHERE appetizer_ordered.order_id = ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Appetizer.class), id);
    }

    public List<AppetizerOrdered> findALLAppetizersOrdered() {
        String sql = "Select * FROM appetizer_ordered";
        List<AppetizerOrdered> appetizerList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(AppetizerOrdered.class));
        return appetizerList;
    }

    public void deleteAppetizerOrderedById(Integer id) {
        String deleteSql = "DELETE FROM appetizer_ordered WHERE order_id = ?";
        jdbcTemplate.update(deleteSql, id);
    }
}
