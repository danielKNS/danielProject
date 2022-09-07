package com.my.FoodTruckApp2.Appetizer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
public class AppetizerService {
//    private final FoodTruck2 appetizer1 = new FoodTruck2(1,"Garlic bread","18/22","21/22",3);
//    private final FoodTruck2 appetizer2 = new FoodTruck2(2,"Breadsticks ","11/22","28/22",2);
//    ArrayList<FoodTruck2> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));
    private final AppetizerRepository appetizerRepository;

//    public AppetizerService(AppetizerRepository appetizerRepository){
//        this.appetizerRepository = appetizerRepository;
//        //Assigning what i recieved from contructor
//        //Service now requires appetizerRepository.
//    }


    public List<FoodTruck2> menu(){
        List<FoodTruck2> appetizers = appetizerRepository.getAllAppetizers();
        System.out.println("this is the menu: " + appetizers);
        return appetizers;
    }
    //EndPoint API

    public FoodTruck2 foods(@RequestBody FoodTruckRequestBody2 foodTruckRequestBody){
        List<FoodTruck2> appetizers = appetizerRepository.getAllAppetizers();
        System.out.println("Creating my FoodTruck: " + foodTruckRequestBody);
        // incrimating the id by one.
        Integer id = appetizers.get(appetizers.size() - 1).getId() + 1;
        //getting the appetizers by the index, get the id and add one(+1) to it.
        //so that when we add new appetizers the id won't be the same and the id number will only increase

        FoodTruck2 foodTruck = new FoodTruck2(
                id,
                foodTruckRequestBody.getAppetizerName(),
                foodTruckRequestBody.getAppetizerDate(),
                foodTruckRequestBody.getAppetizerExpireDate(),
                foodTruckRequestBody.getAppetizerPrice()
        );
        appetizers.add(foodTruck);
        //adding the new appetizer
        return foodTruck;
    }


    public Optional<FoodTruck2> getAppetizerById(@PathVariable Integer id){
        List<FoodTruck2> appetizers = appetizerRepository.getAllAppetizers();
        System.out.println("getting my appetizer by id: " + id);

        Optional<FoodTruck2> foodTruckById = appetizers.stream().filter(foodTruck -> foodTruck.getId().equals(id)).findFirst();
        return  foodTruckById;
    }


    public FoodTruck2 menuUpdate(@RequestBody FoodTruck2 foodTruckRequestBody, @PathVariable Integer id ){
        List<FoodTruck2> appetizers = appetizerRepository.getAllAppetizers();
        Optional<FoodTruck2> optionalAppetizer = appetizers.stream().filter(foodTruck -> foodTruck.getId().equals(id)).findFirst();

        if(optionalAppetizer.isPresent()){
            FoodTruck2 foundAppetizer = optionalAppetizer.get();
            foundAppetizer.setPrice(foodTruckRequestBody.getPrice());
            foundAppetizer.setName(foodTruckRequestBody.getName());
            foundAppetizer.setDate(foodTruckRequestBody.getDate());
            foundAppetizer.setExpireDate(foodTruckRequestBody.getExpireDate());
            if(foodTruckRequestBody.getPrice() == null){
                System.out.println("the price is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }if (foodTruckRequestBody.getName() == null){
                System.out.println("the name is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }if (foodTruckRequestBody.getDate() == null) {
                System.out.println("the Date is null please try again!");
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }if (foodTruckRequestBody.getExpireDate() == null){
                System.out.println("the ExpireDate is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            return foundAppetizer;
            //trying to return the found appetizers with update price.
        }
        //if the optional does not exit, throw the error code
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
    }


    public FoodTruck2 menuUpdate2(@RequestBody FoodTruck2 foodTruckRequestBody, @PathVariable Integer id ){
        List<FoodTruck2> appetizers = appetizerRepository.getAllAppetizers();
        Optional<FoodTruck2> optionalAppetizer = appetizers.stream().filter(foodTruck -> foodTruck.getId().equals(id)).findFirst();

        if(optionalAppetizer.isPresent()){
            FoodTruck2 foundAppetizer = optionalAppetizer.get();
            if(foodTruckRequestBody.getDate() == null){
                System.out.println("Last update: " + foundAppetizer);
                return foundAppetizer;
            }
            foundAppetizer.setDate(foodTruckRequestBody.getDate());
            System.out.println("After the update: " + foundAppetizer);
            if(foodTruckRequestBody.getExpireDate() == null){
                System.out.println("Last update: " + foundAppetizer);
                return foundAppetizer;
            }
            foundAppetizer.setExpireDate(foodTruckRequestBody.getExpireDate());
            System.out.println("After the update: " + foundAppetizer);
            return foundAppetizer;
        }
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND);

    }
//    public ArrayList<FoodTruck2> orderListOfAppetizers(@PathVariable Integer id1){
//        List<FoodTruck2> appetizers = appetizerRepository.getAllAppetizers();
//        Optional<FoodTruck2> optionalAppetizer = appetizers.stream().filter(foodTruck -> foodTruck.getId().equals(id1)).findFirst();
//        Integer id = appetizers.get(appetizers.size() - 1).getId() + 1;
//
//    }
}
