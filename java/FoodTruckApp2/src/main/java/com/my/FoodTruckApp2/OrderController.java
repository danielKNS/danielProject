package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.EntreePlate;
import com.my.FoodTruckApp2.Entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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

    @PostMapping("/orderMenu")
    public Orders addNewOrder(@RequestBody OrdersRequestBody OrderRequestBody){
        return orderService.ordersMealsList(OrderRequestBody);
    }

    @GetMapping("/orderMenu/{id}")
    public Orders ordersById(@PathVariable Integer id){
        return orderService.getOrderById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/orderMenu-UPDATE/{id}")
    public Orders orderUpdate(@RequestBody OrdersRequestBody ordersRequestBody, @PathVariable Integer id){
        return orderService.updateOrderMenu(ordersRequestBody,id);

    }

    @DeleteMapping("/orderMenu-DELETE/{id}")
    public void deleteOrderById(@PathVariable Integer id){
        orderService.deletingOrderById(id);
    }
}
