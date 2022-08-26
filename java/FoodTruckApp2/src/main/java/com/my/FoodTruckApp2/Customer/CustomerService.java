package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
// -----------GETTING ALL CUSTOMER (DATABASE)------------ //
    public List<Customer> gettingAllCustomers(){
        String sql = "SELECT * FROM customer";
        //query means searching for something
        List<Customer> customersList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
        return  customersList;
    }
}
