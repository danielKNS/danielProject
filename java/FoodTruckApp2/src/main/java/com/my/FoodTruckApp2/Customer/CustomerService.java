package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public List<Customer> allCustomers(){
        List<Customer> customers = customerRepository.getAllCustomers();
        System.out.println("this is ALL!! the Customers" +  customers);
        return customers;
    }

// -----------INSERTING A NEW CUSTOMER (HARDCODE)---------  //
    @Autowired
    JdbcTemplate jdbcTemplate;

    public void createNewCustomer(){
        String sql = "INSERT INTO customer(first_name,last_name) VALUES('Lucas','Sasha')";
        Integer rows = jdbcTemplate.update(sql);
        if(rows > 0){
            System.out.println("A new row has been inserted!!!");
        }
    }
}
