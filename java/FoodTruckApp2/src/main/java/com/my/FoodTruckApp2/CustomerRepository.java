package com.my.FoodTruckApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class CustomerRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createNewCustomer(){
        String sql = "INSERT INTO customer VALUES (11,'Lucas','Sasha')";
		Integer rows = jdbcTemplate.update(sql);
		if(rows > 0){
			System.out.println("A new row has been inserted!!!");
		}
    }
}
