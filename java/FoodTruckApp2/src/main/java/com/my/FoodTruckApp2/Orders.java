package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Orders {
    private Integer id;
    private List<Entree> entreeOrders;
    private List<FoodTruck2> appetizerOrders;
//    private String name;
//    private String appetizer;
//    private String entree;
//    private Integer totalPrice;
}
