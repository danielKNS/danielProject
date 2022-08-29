package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping("/customers")
    public void createNewCustomer(){
        log.info("Creating new Customer");
        customerService.createNewCustomer();
    }

    @GetMapping("/customers/{id}")
    public Customer gettingCustomerByid(@PathVariable Integer id){
        log.info("getting a customer by " + id + " !!");
        return customerService.gettingCustomerById(id);
    }
}
