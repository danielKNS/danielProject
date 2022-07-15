package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Entree.EntreePlate;
import com.my.FoodTruckApp2.Entree.EntreeRepository;
import com.my.FoodTruckApp2.Entree.EntreeRequestBody;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersRepository ordersRepository;
    //------------LIST OF MY ORDERS-----------//
    public List<Orders> menuOfFullOrders(){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("this is our Entree: " + ordersList);
        return ordersList;
    }
    //------------ADDING MORE ORDERS-----------//
    public Orders ordersMealsList(OrdersRequestBody orderRequestBody){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("Creating my EntreePlate: " + orderRequestBody);
        // incrimating the id by one.
        Integer id = ordersList.get(ordersList.size() - 1).getId() + 1;
        //getting the appetizers by the index, get the id and add one(+1) to it.
        //so that when we add new appetizers the id won't be the same and the id number will only increase

        Orders ordersMealList = new Orders(
                id,
                orderRequestBody.getEntreePlateOrders(),
                orderRequestBody.getAppetizerOrders()
        );
        ordersList.add(ordersMealList);
        //adding the new appetizer
        return ordersMealList;
    }

    //------------FINDING MY ORDERS-----------//
    public Optional<Orders> getOrderById(Integer id){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("getting my order by id: " + id);

        Optional<Orders> OrdersById = ordersList.stream().filter(orders -> orders.getId().equals(id)).findFirst();
        return  OrdersById;
    }
    //------------UPDATE MY ORDERS-----------//
    public Orders updateOrderMenu(OrdersRequestBody ordersRequestBody,Integer id){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        Optional<Orders> opitionalOrder = ordersList.stream().filter(orders -> orders.getId().equals(id)).findFirst();

        if(opitionalOrder.isPresent()){
            Orders foundOrder = opitionalOrder.get();
            foundOrder.setAppetizerOrders(ordersRequestBody.getAppetizerOrders());
            foundOrder.setEntreePlateOrders(ordersRequestBody.getEntreePlateOrders());
            if(ordersRequestBody.getAppetizerOrders() == null){
                System.out.println("the price is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }if (ordersRequestBody.getEntreePlateOrders() == null){
                System.out.println("the name is null please try again!");
                throw  new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
            return foundOrder;
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    //------------DELETING MY ORDERS-----------//
    public void deletingOrderById(Integer id){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("Deleting Order: " + id);
        if (ordersList.removeIf(orders -> orders.getId().equals(id))){
            System.out.println("id Found!!!");
        }else{
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    //------------UPDATING MY ORDERS(TWO -THREE FIELDS)-----------//
    public  Orders updateFewOrderMenu(Orders orderRequestBody,Integer id){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        Optional<Orders> opitionalOrder = ordersList.stream().filter(orders -> orders.getId().equals(id)).findFirst();

        if(opitionalOrder.isPresent()){
            Orders foundOrder = opitionalOrder.get();
            if(foundOrder.getEntreePlateOrders() == null){
                System.out.println("Order NOT! Update: " + foundOrder);
                return foundOrder;
            }
            foundOrder.setEntreePlateOrders(orderRequestBody.getEntreePlateOrders());
            System.out.println("Order UPDATED!!");

            if(foundOrder.getAppetizerOrders() == null){
                System.out.println("Order NOT! Update: " + foundOrder);
                return foundOrder;
            }
            foundOrder.setAppetizerOrders(orderRequestBody.getAppetizerOrders());
            System.out.println("Order UPDATED!!");
        }
    throw  new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
