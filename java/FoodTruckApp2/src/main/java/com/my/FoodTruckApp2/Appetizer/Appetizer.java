package com.my.FoodTruckApp2.Appetizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Appetizer {
    private Integer id;
    private String name;
    private String date;
    private String expireDate;
    private Integer price;
}
