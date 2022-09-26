package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

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

    /*
    Joining tables will help because using the order_id we can join
     the tables and get the appetizer and entree.
     first the employer get the customer_id.We use the customer id to find the order_id
     Use the order_id to find the appetizer_ids & entree_ids from(appetizerOrdered/entreeOrdered)
     and use their ids to get the appetizer & entree ids(i think we need to create a method
     that gets the order_id and only return appetizer_id/entree_id).The query only needs to
     return the order_id so that we can use the method to find appetider/entreeById.
     */
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
}
