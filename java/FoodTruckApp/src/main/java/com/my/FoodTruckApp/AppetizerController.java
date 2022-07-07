package com.my.FoodTruckApp;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class AppetizerController {
    private final FoodTruck appetizer1 = new FoodTruck(1,"Garlic bread","18/22","21/22",3.12);
    private final FoodTruck appetizer2 = new FoodTruck(2,"Breadsticks ","11/22","28/22",2.99);
    ArrayList<FoodTruck> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));
    //List of array(Appetizers).

    @GetMapping("/menu")
    public List<FoodTruck> menu(){
        System.out.println("this is the menuL: " + appetizers);
        return appetizers;
    }

    //EndPoint API
    @PostMapping("/foodTruck")
    public FoodTruck foods(@RequestBody FoodTruckRequestBody foodTruckRequestBody){
        System.out.println("Creating my FoodTruck: " + foodTruckRequestBody);
        // incrimating the id by one.
        Integer id = appetizers.get(appetizers.size() - 1).getId() + 1;
        //getting the appetizers by the index, get the id and add one(+1) to it.
        //so that when we add new appetizers the id won't be the same and the id number will only increase

        FoodTruck foodTruck = new FoodTruck(
                id,
                foodTruckRequestBody.getFoodName(),
                foodTruckRequestBody.getFoodDate(),
                foodTruckRequestBody.getFoodExpireDate(),
                foodTruckRequestBody.getFoodPrice()
        );
        appetizers.add(foodTruck);
        //adding the new appetizer
        return foodTruck;
    }
    @GetMapping("/foodTruck/{id}")
    public FoodTruck getAppetizerById(@PathVariable Integer id){
        System.out.println("getting my appetizer by id: " + id);

        Optional<FoodTruck> foodTruckById = appetizers.stream().filter(foodTruck -> foodTruck.getId().equals(id)).findFirst();
        return  foodTruckById.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/menu-Update/{id}")
    public FoodTruck menuUpdate(@RequestBody FoodTruck foodTruckRequestBody, @PathVariable Integer id ){
        Optional<FoodTruck> optionalAppetizer = appetizers.stream().filter(foodTruck -> foodTruck.getId().equals(id)).findFirst();

        if(optionalAppetizer.isPresent()){
            FoodTruck foundAppetizer = optionalAppetizer.get();
            foundAppetizer.setPrice(foodTruckRequestBody.getPrice());
            return foundAppetizer;
            //trying to return the found appetizers with update price.
        }
        //if the optional does not exit, throw the error code
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND);

    }

//    @GetMapping("/appetizers")
//    public String getAppetizer(){
//        System.out.println("hello");
//        return "hello";
//    }
}
