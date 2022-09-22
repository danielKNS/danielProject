package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Customer.Customer;
import com.my.FoodTruckApp2.Entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrdersRequestBody {
    private Integer customerId;
    private List<Entree> entreeOrders;
    private List<Appetizer> appetizerOrders;
}
