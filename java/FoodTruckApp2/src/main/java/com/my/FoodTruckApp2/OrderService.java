package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Entree.EntreePlate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersRepository ordersRepository;
    public List<Orders> menuOfFullOrders(){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("this is our Entree: " + ordersList);
        return ordersList;
    }
}
