package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrdersRepository ordersRepository;

    public OrderDto createNewOrder(@RequestBody NewOrderRequestBody ordersRequestBody) {
        log.info("Looking for Appetizers & Entrees....");
        return ordersRepository.CreateNewOrder(ordersRequestBody);
    }


}
