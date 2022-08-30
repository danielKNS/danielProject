package com.my.FoodTruckApp2.Customer;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Repository
public class CustomerRepository {
  private final Customer customer1 = new Customer(1,"Carlos", "Neto");
  private final Customer customer2 = new Customer(1,"João", "Ricarto");
  ArrayList<Customer> customers = new ArrayList<>(Arrays.asList(customer1,customer2));

  public  ArrayList<Customer> getAllCustomers(){
    return customers;
  }
}

