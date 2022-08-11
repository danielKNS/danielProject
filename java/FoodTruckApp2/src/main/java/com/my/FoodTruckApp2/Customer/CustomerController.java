package com.my.FoodTruckApp2.Customer;

import com.my.FoodTruckApp2.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CustomerController {

    private final CustomerRepository customerRepository;

    @PostMapping("/customers")
    public void createNewCustomer(){
        log.info("Creating new Customer");
        customerRepository.createNewCustomer();
    }

}
