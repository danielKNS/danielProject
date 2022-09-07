package com.my.FoodTruckApp2.Entree;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
public class EntreeController {
    private final EntreeService entreeService;

    //   ----------- INSERTING A NEW ENTREE -----------  //
    @PostMapping("/entrees")
    public EntreePlate creatingNewCustomer(@RequestBody EntreeRequestBody entreeRequestBody){
        log.info("Creating a new Entree!!!");
        return entreeService.createNewEntre(entreeRequestBody);
    }
    // ---------GETTING ENTREE BY THEIR ID----------//
    @GetMapping("/entrees/{id}")
    public EntreePlate getEntryById(@PathVariable Integer id){
        log.info("Looking for the id: " + id);
        return entreeService.gettingEntreeById(id);
    }
    // -----------GETTING ALL ENTREE(DATABASE)------------ //
    @GetMapping("/entrees")
    public List<EntreePlate> getALlEntrees(){
        log.info("Getting ALl entress");
        return entreeService.gettingALEntrees();
    }
    // ----------- DELETING ENTREE BY THEIR ID -------------//
    @DeleteMapping("/entrees/{id}")
    public void deleteEntreById(@PathVariable Integer id){
        log.info("DELETING entree with id: " +id);
        entreeService.deleteEntreById(id);
    }
}