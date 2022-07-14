package com.my.FoodTruckApp2.Entree;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EntreeRequestBody {
    private String entreeName;
    private Integer entreePrice;
}