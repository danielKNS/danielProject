package com.my.FoodTruckApp2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class FoodTruckApp2Application {

	public static void main(String[] args) {
		SpringApplication.run(FoodTruckApp2Application.class, args);

		System.out.println("Its working");
	}

}
