package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrderRepository {
    private final JdbcTemplate jdbcTemplate;


    public Order createNewOrder(NewOrderRequestBody ordersRequestBody) {
        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
        Order order = jdbcTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(Order.class),
                ordersRequestBody.getCustomerId());
        log.info("Order is Created!!:  " + order);
        return order;
    }

    public Order gettingOrderById(Integer id) {
        log.info("looking getting order by id: " + id);
        String sql = "SELECT * FROM \"order\" WHERE id = ? ";
        try {
            Order order = jdbcTemplate.queryForObject(
                    sql,
                    new BeanPropertyRowMapper<>(Order.class),
                    id
            );
            return order;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id: " + id + " was not found");
        }
    }

    /*
    We want to get ALl orders(List<Order>)
     */
    public List<Order> gettingAllOrders() {
        log.info("SELECTING the orders...");
        String sql = "SELECT * FROM \"order\"  ";
        List<Order> orders = jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(Order.class)
        );

        return orders;
    }

    public void deleteOrderById(Integer id) {
        String sql = "SELECT * FROM \"order\" WHERE id = ? ";
        try {
            jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Order.class), id);
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.info("This order id: " + id + " does NOT EXIST! ");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "This id: " + id + "Is not found ");
        }
        log.info("id: " + id + " Order has been deleted! ");
        String deleteSql = "DELETE FROM \"order\" WHERE id = ?";
        jdbcTemplate.update(deleteSql, id);
    }
}
