package com.my.FoodTruckApp2.Appetizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FoodTruckRequestBody2 {
    private String foodName;
    private String foodDate;
    private String foodExpireDate;
    private Integer foodPrice;
}
