package com.my.FoodTruckApp2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Orders {
    private Integer id;
    private String name;
    private String appetizer;
    private String entree;
    private Integer totalPrice;
}
