package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

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
public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
    String sql = "INSERT INTO customer(first_name,last_name) VALUES(?,?)";
    Integer rows = jdbcTemplate.update(sql,customerRequestBody.getCustomerFirstName(),customerRequestBody.getCustomerLastName());
    if(rows > 0){
        System.out.println(sql + " SERVICE");
        System.out.println("A new customer was CREATED!!!(has been inserted)");
    }
    return sql;
    // the return goes straight to postman
    // then goes to customerController line 41
}
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
