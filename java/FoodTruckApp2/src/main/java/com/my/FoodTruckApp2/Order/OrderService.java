package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Appetizer.AppetizerRepository;
import com.my.FoodTruckApp2.Entree.Entree;
import com.my.FoodTruckApp2.Entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {
    private final OrdersRepository ordersRepository;
    private final AppetizerRepository appetizerRepository;
    private final EntreeRepository entreeRepository;

    public OrderDto createNewOrder(NewOrderRequestBody ordersRequestBody) {
        Order order = ordersRepository.createNewOrder(ordersRequestBody);
        // the order is inserted now we take the appetizerId from the requestBody
        // now we need to find the id by using the method in AppetizerRepository
        List<Appetizer> appetizers = ordersRequestBody.getAppetizerIds().stream().map(appetizerId -> {
            appetizerRepository.createAppetizersReceipt(order.getId(), appetizerId);
            return appetizerRepository.gettingAppetizerById(appetizerId);
        }).collect(Collectors.toList());

        List<Entree> entrees = ordersRequestBody.getEntreeIds().stream().map(entreeId -> {
            entreeRepository.createEntreeReceipt(order.getId(), entreeId);
            return entreeRepository.gettingEntreeById(entreeId);
        }).collect(Collectors.toList());

        OrderDto orderDto = new OrderDto(
                order.getId(),
                ordersRequestBody.getCustomerId(),
                appetizers,
                entrees
        );
        return orderDto;
    }

}
