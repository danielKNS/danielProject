package com.my.FoodTruckApp2;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//import AppetizerService.class;
@RestController
@RequiredArgsConstructor// looks for all fields but only uses final REQUIRED fields.
public class AppetizerControler2 {
//    @Autowired
//   //private AppetizerRepository appetizerRepository = new AppetizerRepository();
    private AppetizerService  appetizerService;//INSTANCE
    //autowired make a loose coupled between appetizerController
    // and appetizerService.
    //if you want  an instance of the service, we ask spring for
    // it through the private variable
    // we can use this to tell spring to INJECT IT/
    //if the method has an argument you should add it.
//    public  AppetizerControler2(AppetizerService appetizerService){
//        this.appetizerService = appetizerService;
//    }

   @GetMapping("/menus")
   public List<FoodTruck2> menu(){
       return appetizerService.menu();
   }
   @PostMapping("/foodTrucks")
public FoodTruck2 foods(@RequestBody FoodTruckRequestBody2 foodTruckRequestBody){
       return appetizerService.foods(foodTruckRequestBody);
}
    @GetMapping("/foodTrucks/{id}")
    public FoodTruck2 getAppetizerById(@PathVariable Integer id){
    return appetizerService.getAppetizerById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
//
    @PutMapping("/menu-Updates/{id}")
    public FoodTruck2 menuUpdate(@RequestBody FoodTruck2 foodTruckRequestBody, @PathVariable Integer id ){
    return appetizerService.menuUpdate(foodTruckRequestBody,id);
    }
//
    @PatchMapping("/menu-Updates/{id}")
    public FoodTruck2 menuUpdate2(@RequestBody FoodTruck2 foodTruckRequestBody, @PathVariable Integer id ){
       return appetizerService.menuUpdate2(foodTruckRequestBody,id);
    }
}

