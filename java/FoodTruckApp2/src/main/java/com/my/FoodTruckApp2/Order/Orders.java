package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.Appetizer;
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
    private Integer customerId;
    private Integer appetizerIds;
//    private List<Entree> entreeOrders;
//    private List<Appetizer> appetizerOrders;
}
