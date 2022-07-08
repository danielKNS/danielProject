package com.my.FoodTruckApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FoodTruckRequestBody {
    private String foodName;
    private String foodDate;
    private String foodExpireDate;
    private Integer foodPrice;
}
