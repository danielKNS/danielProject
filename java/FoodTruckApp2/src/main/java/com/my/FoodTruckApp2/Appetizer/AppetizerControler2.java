package com.my.FoodTruckApp2.Appetizer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

//import AppetizerService.class;
@RestController
@RequiredArgsConstructor// looks for all fields but only uses final REQUIRED fields.
@Slf4j
public class AppetizerControler2 {
    private final AppetizerService appetizerService; //INSTANCE
    //autowired make a loose coupled between appetizerController
    // and appetizerService.
    //if you want  an instance of the service, we ask spring for
    // it through the private variable
    // we can use this to tell spring to INJECT IT/
    //if the method has an argument you should add it.
    //   ----------- INSERTING A NEW APPETIZER -----------  //
    @PostMapping("/appetizers")
    public Appetizer createNewAppetizer(@RequestBody AppetizerRequestBody appetizerRequestBody){
        log.info("Creating a new Appetizer");
        return appetizerService.createNewApptizer(appetizerRequestBody);
    }

    // ---------GETTING APPETIZER BY THEIR ID----------//
    @GetMapping("/appetizers/{id}")
    public Appetizer getAppetizerById(@PathVariable Integer id){
        log.info("Looking for the id: " + id);
        return appetizerService.gettingAppetizerById(id);
    }

    // -----------GETTING ALL APPETIZER------------ //
    @GetMapping("/appetizers")
    public List<Appetizer> getALLAppetizer(){
        log.info("Looking for the id: " );
        return appetizerService.gettingALLAppetizer();
    }

    // ----------- DELETING APPETIZER BY THEIR ID -------------//
    @DeleteMapping("/appetizers/{id}")
    public void deleteAppetizerById(@PathVariable Integer id){
        log.info("DELETING id: " + id);
        appetizerService.deletingAppetizerById(id);
    }
}

