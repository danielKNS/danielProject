package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RequiredArgsConstructor
@Slf4j
@Repository
public class CustomerRepository {
  @Autowired
  JdbcTemplate jdbcTemplate;
//  private final Customer customer1 = new Customer(1,"Carlos", "Neto");
//  private final Customer customer2 = new Customer(1,"João", "Ricarto");
//  ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(customer1,customer2));
//
//  public  ArrayList<Customer> getAllCustomers(){
//    return customers;
//  }
//    public void createNewCustomer(){
//        String sql = "INSERT INTO customer(first_name,last_name) VALUES('Lucas','Sasha')";
//        Integer rows = jdbcTemplate.update(sql);
//        if(rows > 0){
//            log.info("A new row has been inserted!!!");
//        }
//    }
public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
  String sql = "INSERT INTO customer(first_name,last_name) VALUES(?,?)";
  Integer rows = jdbcTemplate.update(sql,customerRequestBody.getFirstName(),customerRequestBody.getLastName());
  if(rows > 0){
    log.info("A new customer was CREATED!!!(has been inserted)");
  }
  return sql;
  // the return goes straight to postman
  // then goes to customerController line 41
  }

  public Customer gettingCustomerById(@PathVariable Integer id){
    String sql = "SELECT * FROM customer WHERE id = ?";
    try{
      //this is an example of Mapping: we are getting the string but it then reads essentially the string and places it the right fields(id etc.) for the object we have in java.
      Customer customerId = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<>(Customer.class),id);
      // queryForObject return the whole object(A specific object)
      return customerId;
    }catch (EmptyResultDataAccessException emptyResultDataAccessException){
      log.error("There is no customer that have this id: " + id);
      throw new ResponseStatusException(HttpStatus.NOT_FOUND, id + " NOT FOUND/EXIST");
    }
  }

  public List<Customer> gettingAllCustomers(){
    String sql = "SELECT * FROM customer";
    //query means searching for something
    List<Customer> customersList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
    return  customersList;
  }
}

