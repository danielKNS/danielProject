package com.my.FoodTruckApp;

import java.util.ArrayList;
import java.util.Arrays;

public class AppetizerRepository {
    private final FoodTruck2 appetizer1 = new FoodTruck2(1,"Garlic bread","18/22","21/22",3);
    private final FoodTruck2 appetizer2 = new FoodTruck2(2,"Breadsticks ","11/22","28/22",2);
    ArrayList<FoodTruck2> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));

}
