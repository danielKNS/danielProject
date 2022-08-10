package com.my.FoodTruckApp2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// DriverManager(actually does the connection to the database)
// use annotations to connect files to the main app, it cannot be stand alone app. it needs to connect to spring
// theres a bunch of different ways to do it.
// should not have main method you should not have multiples mains
// todo: press the play buttom of the main app, it will do it for you not some random file
public class Testing implements CommandLineRunner {
//    String url = "jdbc:postgresql://localhost/test_dummy";
//    String user = "owner";
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public void run(String... args) throws Exception {
        String sql = "INSERT INTO customer VALUES (5,'Carlos','Neto')";

        Integer rows = jdbcTemplate.update(sql);
        if(rows > 0){
            System.out.println("A new row has been inserted!!!");
        }

    }
}
