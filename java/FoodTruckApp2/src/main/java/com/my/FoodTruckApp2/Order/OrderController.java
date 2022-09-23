package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/orders")
    public OrderDto createNewOrder(@RequestBody NewOrderRequestBody ordersRequestBody) {
        log.info("Creating a new Order.....");
        return orderService.createNewOrder(ordersRequestBody);
    }

    @GetMapping("/orders/{id}")
    public OrderDto getOrderById(@PathVariable Integer id) {
        log.info("Looking for order with id: " + id);
        return orderService.gettingOrderById(id);
    }

}
