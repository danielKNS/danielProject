package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Entree.Entree;
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
    private final Entree entree1 = new Entree(1,"Butter Chicken",5);
    private final Entree entree2 = new Entree(2,"Palak Paneer ",3);
    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));
    public ArrayList<Entree> getAllEntrePlates() {
        return entrees;
    }
    //-----------------------APPETIZERS------------------------//
    private final Appetizer appetizer1 = new Appetizer(1,"Garlic bread","18/22","21/22",3);
    private final Appetizer appetizer2 = new Appetizer(2,"Breadsticks ","11/22","28/22",2);
    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));
    public ArrayList<Appetizer> getAllAppetizersPlates() {
        return appetizers;
    }
    //-----------------------ORDERS--------------------------//
    private final Orders order1 = new Orders(1, entrees,appetizers);
    private final Orders order2 = new Orders(2, entrees,appetizers);
//    private final Orders order1 = new Orders(1,"name","Appetizer","Butter Chicken",5);
//    private final Orders order2 = new Orders(2,"name","Appetizer","Palak Panner",5);
//
    ArrayList<Orders> orders = new ArrayList<>(Arrays.asList(order1,order2));
//
    public ArrayList<Orders> getAllOrders(){
        return orders;
    }
}
