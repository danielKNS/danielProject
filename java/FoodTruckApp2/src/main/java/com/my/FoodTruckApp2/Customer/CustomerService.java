package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class CustomerService {
    private final CustomerRepository customerRepository;
// ----------- INSERTING A NEW CUSTOMER -----------  //
public Customer createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
    return customerRepository.createNewCustomer(customerRequestBody);
}
// ---------GETTING CUSTOMER BY THEIR ID----------//

    public Customer gettingCustomerById(@PathVariable Integer id){
        return  customerRepository.gettingCustomerById(id);
    }
// -----------GETTING ALL CUSTOMER (DATABASE)------------ //
public List<Customer> gettingAllCustomers(){
   return customerRepository.gettingAllCustomers();
}
    public void deletingCustomerById(@PathVariable Integer id){
        customerRepository.deleteCustomerById(id);
    }
}
