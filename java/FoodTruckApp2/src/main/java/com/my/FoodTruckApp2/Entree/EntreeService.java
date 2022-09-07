package com.my.FoodTruckApp2.Entree;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EntreeService {

    private final EntreeRepository entreeRepository;
    //   ----------- INSERTING A NEW ENTREE -----------  //
    public EntreePlate createNewEntre(@RequestBody EntreeRequestBody entreeRequestBody){
        log.info("Entree LOADING......");
       return entreeRepository.createNewEntree(entreeRequestBody);
    }
    // ---------GETTING ENTREE BY THEIR ID----------//
    public EntreePlate gettingEntreeById(@PathVariable Integer id){
        log.info("Entree SEARCHING......");
        return entreeRepository.gettingEntreeById(id);
    }
    // -----------GETTING ALL ENTREE(DATABASE)------------ //
    public List<EntreePlate> gettingALEntrees(){
        log.info("SELECTING ALL entrees");
        return entreeRepository.gettingAllEntree();
    }
    // ----------- DELETING ENTREE BY THEIR ID -------------//
    public void deleteEntreById(@PathVariable Integer id){
        log.info("SEARCHING for id: " + id + " .....");
        entreeRepository.deleteEntreeById(id);
    }

}