package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/orders")
    public List<OrderDto> getAllOrder() {
        log.info("looking for ALL orders...");
        return orderService.gettingAllOrders();
    }

    @DeleteMapping("/orders/{id}")
    public void deletingOrderById(@PathVariable Integer orderId) {
        log.info("Looking for the order id: " + orderId);
        orderService.deleteOrderById(orderId);
    }
}
