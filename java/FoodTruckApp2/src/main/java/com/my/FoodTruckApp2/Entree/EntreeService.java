package com.my.FoodTruckApp2.Entree;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EntreeService {

    private final EntreeRepository entreeRepository;

    public List<EntreePlate> menu(){
        List<EntreePlate> entreePlates = entreeRepository.getAllEntrePlates();
        System.out.println("this is our Entree: " + entreePlates);
        return entreePlates;
    }

    public EntreePlate EntrePlateList(@RequestBody EntreeRequestBody entreeRequestBody){
        List<EntreePlate> entreePlates = entreeRepository.getAllEntrePlates();
        System.out.println("Creating my EntreePlate: " + entreeRequestBody);
        // incrimating the id by one.
        Integer id = entreePlates.get(entreePlates.size() - 1).getId() + 1;
        //getting the appetizers by the index, get the id and add one(+1) to it.
        //so that when we add new appetizers the id won't be the same and the id number will only increase

        EntreePlate entreePlateList = new EntreePlate(
                id,
                entreeRequestBody.getEntreeName(),
                entreeRequestBody.getEntreePrice()
        );
        entreePlates.add(entreePlateList);
        //adding the new appetizer
        return entreePlateList;
    }

    public Optional<EntreePlate> getEntrePlateById(@PathVariable Integer id){
        List<EntreePlate> entreePlates = entreeRepository.getAllEntrePlates();
        System.out.println("getting my entreePlates by id: " + id);

        Optional<EntreePlate> EntreePlateById = entreePlates.stream().filter(entreePlate -> entreePlate.getId().equals(id)).findFirst();
        return  EntreePlateById;
    }

    public EntreePlate menuEntreeUpdate(@RequestBody EntreePlate entreePlateRequestBody, @PathVariable Integer id ){
        List<EntreePlate> entreePlates = entreeRepository.getAllEntrePlates();
        Optional<EntreePlate> optionalEntreePlate = entreePlates.stream().filter(entreePlate -> entreePlate.getId().equals(id)).findFirst();

        if(optionalEntreePlate.isPresent()){
            EntreePlate foundEntreePlate = optionalEntreePlate.get();
            foundEntreePlate.setPrice(entreePlateRequestBody.getPrice());
            foundEntreePlate.setName(entreePlateRequestBody.getName());
            if(entreePlateRequestBody.getPrice() == null){
                System.out.println("the price is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }if (entreePlateRequestBody.getName() == null){
                System.out.println("the name is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            return foundEntreePlate;
            //trying to return the found appetizers with update price.
        }
        //if the optional does not exit, throw the error code
        throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    public void deleteEntreById(@PathVariable Integer id){
        List<EntreePlate> entreePlates = entreeRepository.getAllEntrePlates();
        System.out.println("Deleting id: " + id);
        entreePlates.removeIf(entreePlate -> entreePlate.getId().equals(id));
        //if the id is the same that i asked for then Entree will be deleted.
    }

}