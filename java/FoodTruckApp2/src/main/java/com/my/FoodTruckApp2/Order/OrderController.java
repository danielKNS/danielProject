package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//todo: FIX you URLs
@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orderss")
    public OrderDto createNewOrder(@RequestBody NewOrderRequestBody ordersRequestBody) {
        log.info("Creating a new Order.....");
        return orderService.createNewOrder(ordersRequestBody);
    }
}
