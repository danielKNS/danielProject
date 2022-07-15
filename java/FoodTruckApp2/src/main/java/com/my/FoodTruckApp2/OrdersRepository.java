package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.EntreeController;
import com.my.FoodTruckApp2.Entree.EntreePlate;
import com.my.FoodTruckApp2.Entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
@RequiredArgsConstructor
public class OrdersRepository {
    private final AppetizerService appetizerService;
    private final EntreeService entreeService;

    //------------------------ENTREE---------------------------//
    private final EntreePlate entreePlate1 = new EntreePlate(1,"Butter Chicken",5);
    private final EntreePlate entreePlate2 = new EntreePlate(2,"Palak Paneer ",3);
    ArrayList<EntreePlate> entreePlates = new ArrayList<>(Arrays.asList(entreePlate1,entreePlate2));
    public ArrayList<EntreePlate> getAllEntrePlates() {
        return entreePlates;
    }
    //-----------------------APPETIZERS------------------------//
    private final FoodTruck2 appetizer1 = new FoodTruck2(1,"Garlic bread","18/22","21/22",3);
    private final FoodTruck2 appetizer2 = new FoodTruck2(2,"Breadsticks ","11/22","28/22",2);
    ArrayList<FoodTruck2> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));
    public ArrayList<FoodTruck2> getAllAppetizersPlates() {
        return appetizers;
    }
    //-----------------------ORDERS--------------------------//
    private final Orders order1 = new Orders(1, entreePlates,appetizers);
    private final Orders order2 = new Orders(2, entreePlates,appetizers);
//    private final Orders order1 = new Orders(1,"name","Appetizer","Butter Chicken",5);
//    private final Orders order2 = new Orders(2,"name","Appetizer","Palak Panner",5);
//
    ArrayList<Orders> orders = new ArrayList<>(Arrays.asList(order1,order2));
//
    public ArrayList<Orders> getAllOrders(){
        return orders;
    }
}
