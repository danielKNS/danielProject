package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrdersRequestBody {

    private List<Entree> entreeOrders;
    private List<Appetizer> appetizerOrders;
//    private String mealName;
//    private String mealAppetizer;
//    private String mealEntree;
//    private Integer mealTotalPrice;
}
