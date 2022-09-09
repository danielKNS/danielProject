package com.my.FoodTruckApp2.Appetizer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor
@Slf4j
public class AppetizerService {

    private final AppetizerRepository appetizerRepository;

    //   ----------- INSERTING A NEW APPETIZER -----------  //
    public Appetizer createNewApptizer(@RequestBody AppetizerRequestBody appetizerRequestBody){
        log.info("Loading new appetizer.....");
        return appetizerRepository.creatingNewAppetizer(appetizerRequestBody);
    }

    // ---------GETTING APPETIZER BY THEIR ID----------//
    public Appetizer gettingAppetizerById(@PathVariable Integer id){
        log.info("Looking for the id: " + id);
        return appetizerRepository.gettingAppetizerById(id);
    }

    // -----------GETTING ALL APPETIZER------------ //
    public List<Appetizer> gettingALLAppetizer(){
        log.info("Geeting ALL appetizers ");
        return appetizerRepository.gettingALlAppetizer();
    }

    // ----------- DELETING APPETIZER BY THEIR ID -------------//
    public void deletingAppetizerById(@PathVariable Integer id){
        log.info("DELETING id: " + id);
        appetizerRepository.deleteAppetizerById(id);
    }
}
