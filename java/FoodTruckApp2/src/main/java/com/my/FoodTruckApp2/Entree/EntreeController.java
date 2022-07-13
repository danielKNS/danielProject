package com.my.FoodTruckApp2.Entree;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class EntreeController {
    private final EntreeService entreeService;
//-----------TESTING----------------//
//    @GetMapping("/Helloit")
//    public String hello(){
//        System.out.println("hello");
//        return "hi";
//    }
    //-------------WORK!!!-------------//

    //-----------GETTING THE LIST OF ENTREE-------------//
    @GetMapping("/menus-Entree")
    public List<EntreePlate> menuEntree(){
        return entreeService.menu();
    }// this API isn't return an array. it is returning a HTTP response.
    // who's BODY is an arraylist of entree.
    // Manually below.
//    @GetMapping("/menu")
//    public ResponseEntity<List<EntreePlate>> menu(){
//        List<EntreePlate> entreePlates = entreeService.menu();
//        return new ResponseEntity<>(entreePlates,HttpStatus.OK);
//        }
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