package com.my.FoodTruckApp2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrdersRequestBody {
    private String mealName;
    private String mealAppetizer;
    private String mealEntree;
    private Integer mealTotalPrice;
}
