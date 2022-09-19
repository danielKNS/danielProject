package com.my.FoodTruckApp2.Order;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrdersRepository ordersRepository;

    public OrderDto createNewOrder(NewOrderRequestBody ordersRequestBody) {
        log.info("Looking for Appetizers & Entrees....");
        return ordersRepository.createNewOrder(ordersRequestBody);
    }


}
