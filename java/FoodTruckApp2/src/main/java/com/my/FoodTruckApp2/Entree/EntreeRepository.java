package com.my.FoodTruckApp2.Entree;

import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
@Repository
public class EntreeRepository {
    private final EntreePlate entreePlate1 = new EntreePlate(1,"Butter Chicken",5);
    private final EntreePlate entreePlate2 = new EntreePlate(2,"Palak Paneer ",3);
    ArrayList<EntreePlate> entreePlates = new ArrayList<>(Arrays.asList(entreePlate1,entreePlate2));

    public ArrayList<EntreePlate> getAllEntrePlates(){
        return entreePlates;
    }
}
