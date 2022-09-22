package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

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
}
