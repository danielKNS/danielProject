package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

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
// ---------GETTING CUSTOMER BY THEIR ID----------//

    public Customer gettingCustomerById(@PathVariable Integer id){
        String sql = "SELECT * FROM customer WHERE id = ?";
        try{
         //this is an example of Mapping: we are getting the string but it then reads essentially the string and places it the right fields(id etc.) for the object we have in java.
            Customer customerId = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Customer.class),id);
            // queryForObject return the whole object(A specific object)
            return customerId;
        }catch (EmptyResultDataAccessException emptyResultDataAccessException){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
