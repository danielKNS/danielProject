package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Entree.EntreePlate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
public class OrdersRepository {
    private final Orders order1 = new Orders(1,"name","Appetizer","Butter Chicken",5);
    private final Orders order2 = new Orders(2,"name","Appetizer","Palak Panner",5);

    ArrayList<Orders> orders = new ArrayList<>(Arrays.asList(order1,order2));

    public ArrayList<Orders> getAllOrders(){
        return orders;
    }
}
