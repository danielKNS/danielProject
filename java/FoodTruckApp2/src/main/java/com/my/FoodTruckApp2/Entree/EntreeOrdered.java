package com.my.FoodTruckApp2.Entree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntreeOrdered {
    private Integer orderId;
    private Integer entreeId;
}
