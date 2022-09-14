package com.my.FoodTruckApp2.Order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class AppetizerOrdered {
    private Integer orderId;
    private Integer appetizerId;
}
