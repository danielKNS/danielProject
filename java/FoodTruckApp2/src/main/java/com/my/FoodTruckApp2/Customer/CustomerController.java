package com.my.FoodTruckApp2.Customer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/customers")
    public String createNewCustomer(@RequestBody CustomerRequestBody customerRequestBody){
        log.info("Creating new Customer");
        System.out.println(customerRequestBody + "CONTROLLER");
        return customerService.createNewCustomer(customerRequestBody);
    }
}
