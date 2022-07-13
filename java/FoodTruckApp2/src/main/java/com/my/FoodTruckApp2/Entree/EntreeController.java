package com.my.FoodTruckApp2.Entree;

import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Appetizer.FoodTruckRequestBody2;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EntreeController {
    private final EntreeService entreeService;
//-----------TESTING----------------//
    @GetMapping("/Helloit")
    public String hello(){
        System.out.println("hello");
        return "hi";
    }
    //-------------WORK!!!-------------//

    //-----------GETTING THE LIST OF ENTREE-------------//
    @GetMapping("/menus")
    public List<EntreePlate> menu(){
        return entreeService.menu();
    }
    //-----------GETTING THE ENTREE-------------//
    @GetMapping("/EntrePlate/{id}")
    public EntreePlate getEntrePlateById(@PathVariable Integer id){
        return entreeService.getEntrePlateById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
    //-----------WE CREATE A NEW PLATE(ENTREE)AND ADDING TO THE LIST-------------//
    @PostMapping("/EntreePlateList")
    public EntreePlate EntrePlateList(@RequestBody EntreeRequestBody entreeRequestBody){
        return entreeService.EntrePlateList(entreeRequestBody);
    }
    //-----------UPDATES THE ENTREE-------------//
    @PutMapping("/menuEntree-Updates/{id}")
    public EntreePlate menuEntreeUpdate(@RequestBody EntreePlate entreePlateRequestBody, @PathVariable Integer id ){
        return entreeService.menuEntreeUpdate(entreePlateRequestBody,id);
    }
    //-----------DELETING THE ENTREE-------------//
    @DeleteMapping("/deleteEntree/{id}")
    public void deleteEntreById(@PathVariable Integer id){
        entreeService.deleteEntreById(id);
    }
}
