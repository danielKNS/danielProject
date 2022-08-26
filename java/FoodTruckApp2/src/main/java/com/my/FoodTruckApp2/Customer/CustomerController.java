package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/customersList")
    public List<Customer> allCustomers(){
        System.out.println("Getting ALL Customers");
        return customerService.gettingAllCustomers();
    }

}
