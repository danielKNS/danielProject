package com.my.FoodTruckApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FoodTruck {
    private Integer id;
    private String name;
    private String date;
    private String expireDate;
    private Double price;
}
