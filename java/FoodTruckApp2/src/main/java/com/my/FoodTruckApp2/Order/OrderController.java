package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Entree.EntreeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
//todo: FIX you URLs
@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orderss")
    public Orders createNewOrder(@RequestBody NewOrderRequestBody ordersRequestBody){
        log.info("Creating a new Order.....");
    return orderService.createNewOrder(ordersRequestBody);
    }
}
