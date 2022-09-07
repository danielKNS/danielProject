package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/customers")
    public Customer createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
        log.info("Creating new Customer");
        return customerService.createNewCustomer(customerRequestBody);
    }
    @GetMapping("/customers/{id}")
    public Customer gettingCustomerByid(@PathVariable Integer id){
        log.info("getting a customer by " + id + " !!");
        return customerService.gettingCustomerById(id);
    }
    @GetMapping("/customers")
    public List<Customer> allCustomers(){
        log.info("Getting ALL Customers");
        return customerService.gettingAllCustomers();
    }
    @DeleteMapping("/customers/{id}")
    public void deletingCustomerById(@PathVariable Integer id){
        log.info("Deleting a Customer....");
        customerService.deletingCustomerById(id);
    }

}