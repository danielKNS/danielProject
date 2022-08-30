package com.my.FoodTruckApp2.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerRequestBody {
    private String firstName;
    private String lastName;
}
