package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.EntreePlate;
import com.my.FoodTruckApp2.Entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final AppetizerService appetizerService;
    private final EntreeService entreeService;
    private final OrderService orderService;

    @GetMapping("/menus-Appetizer-Order")
    public List<FoodTruck2> menuAppetizer(){
        return appetizerService.menu();
    }

    @GetMapping("/menu-Entree-Order")
    public List<EntreePlate> menuEntree(){
        return entreeService.menu();
    }

    @GetMapping("/menuOfMeals")
    public List<Orders>menuOfFullOrders(){
        return orderService.menuOfFullOrders();
    }
}