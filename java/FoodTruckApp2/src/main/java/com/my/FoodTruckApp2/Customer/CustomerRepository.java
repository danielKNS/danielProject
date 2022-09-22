package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@Repository
public class CustomerRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    //   ----------- INSERTING A NEW CUSTOMER -----------  //
    public Customer createNewCustomer(CustomerRequestBody customerRequestBody) {
        String sql = "INSERT INTO customer(first_name,last_name) VALUES(?, ?) RETURNING *";
        Customer newCustomer = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class),
                customerRequestBody.getFirstName(), customerRequestBody.getLastName());
        return newCustomer;
//     the return goes straight to postman
//     then goes to customerController line 41
    }


    // ---------GETTING CUSTOMER BY THEIR ID----------//
    public Customer gettingCustomerById(Integer id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        try {
            //this is an example of Mapping: we are getting the string but it then reads essentially the string and places it the right fields(id etc.) for the object we have in java.
            Customer customerId = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class), id);
            // queryForObject return the whole object(A specific object)
            return customerId;
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("There is no customer that have this id: " + id);
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, id + " NOT FOUND/EXIST");
        }
    }

    // -----------GETTING ALL CUSTOMER (DATABASE)------------ //
    public List<Customer> gettingAllCustomers() {
        String sql = "SELECT * FROM customer";
        //query means searching for something
        List<Customer> customersList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Customer.class));
        return customersList;
    }

    // ----------- DELETING CUSTOMERS BY THEIR ID -------------//

    public void deleteCustomerById(Integer id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        String sqlDelete = "DELETE FROM customer WHERE id = ?";
        try {
            // Searching for the id
            jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Customer.class), id);
            log.info("Customer has been Deleted!! USER ID: " + id);
            // if the id does not exist it will go through catch and send a Http response.
        } catch (EmptyResultDataAccessException emptyResultDataAccessException) {
            log.error("THIS ID:" + id + "DOES NOT EXIST");
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        // But if it does exist it will skip the catch and goes to jdbcTemplate.update
        // to delete the customer.
        jdbcTemplate.update(sqlDelete, id);
    }
}
