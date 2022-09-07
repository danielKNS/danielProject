package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.AppetizerControler2;
import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.EntreeController;
import com.my.FoodTruckApp2.Entree.EntreePlate;
import com.my.FoodTruckApp2.Entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
//todo: FIX you URLs
@RestController
@RequiredArgsConstructor
public class OrderController {
    private final AppetizerService appetizerService;
    private final EntreeService entreeService;
    private final OrderService orderService;

    //------------LIST ONLY OF APPETIZER-----------//
    @GetMapping("/appetizer")
    public List<FoodTruck2> menuAppetizer(){
        return appetizerService.menu();
    }

    //------------LIST ONLY OF ENTREE-----------//
//    @GetMapping("/entree")
//    public List<EntreePlate> menuEntree(){
//        return entreeService.menu();
//    }

    //------------LIST OF MY ORDERS-----------//
    @GetMapping("/orders")
    public List<Orders>menuOfFullOrders(){
        return orderService.menuOfFullOrders();
    }

    //------------ADDING MORE ORDERS-----------//
    @PostMapping("/orders")
    public Orders addNewOrder(@RequestBody OrdersRequestBody orderRequestBody){
        return orderService.ordersMealsList(orderRequestBody);
    }

    //------------FINDING MY ORDERS-----------//
    @GetMapping("/orders/{id}")
    public Orders ordersById(@PathVariable Integer id){
        return orderService.getOrderById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

//    @PostMapping("/orders")
//    public Orders creatingNewOrder(@RequestBody NewOrderRequestBody newOrderRequestBody){
//        return orderService.orders(newOrderRequestBody);
//    }

    //------------UPDATE MY ORDERS-----------//
//    @PutMapping("/orders/{id}")
//    public Orders orderUpdate(@RequestBody OrdersRequestBody ordersRequestBody, @PathVariable Integer id){
//        return orderService.updateOrderMenu(ordersRequestBody,id);
//    }

//    @DeleteMapping("/orderMenu-DELETE/{id}")
//    public void deleteOrderById(@PathVariable Integer id){
//        orderService.deletingOrderById(id);
//    }
//
//    @PatchMapping("/orderFew-UPDATES/{id}")
//    public Orders orderFewUpdate(@RequestBody Orders orderRequestBody, @PathVariable Integer id){
//        return orderService.updateFewOrderMenu(orderRequestBody,id);
//    }
}
