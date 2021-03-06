package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.EntreePlate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrdersRequestBody {

    private List<EntreePlate> entreePlateOrders;
    private List<FoodTruck2> appetizerOrders;
//    private String mealName;
//    private String mealAppetizer;
//    private String mealEntree;
//    private Integer mealTotalPrice;
}
