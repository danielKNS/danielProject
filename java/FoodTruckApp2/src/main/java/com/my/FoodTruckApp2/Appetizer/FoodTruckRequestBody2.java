package com.my.FoodTruckApp2.Appetizer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FoodTruckRequestBody2 {
    private String appetizerName;
    private String appetizerDate;
    private String appetizerExpireDate;
    private Integer appetizerPrice;
}
