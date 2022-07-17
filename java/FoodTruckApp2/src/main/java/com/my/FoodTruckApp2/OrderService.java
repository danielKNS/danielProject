package com.my.FoodTruckApp2;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.FoodTruck2;
import com.my.FoodTruckApp2.Entree.EntreePlate;
import com.my.FoodTruckApp2.Entree.EntreeRepository;
import com.my.FoodTruckApp2.Entree.EntreeRequestBody;
import com.my.FoodTruckApp2.Entree.EntreeService;
import lombok.RequiredArgsConstructor;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersRepository ordersRepository;
    private final EntreeService entreeService;
    private final AppetizerService appetizerService;
    //------------LIST OF MY ORDERS-----------//
    public List<Orders> menuOfFullOrders(){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("this is our Order: " + ordersList);
        return ordersList;
    }
    //------------ADDING MORE ORDERS-----------//
    public Orders ordersMealsList(OrdersRequestBody orderRequestBody){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("Creating my Order: " + orderRequestBody);
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

    //------------CREATED A NEW ORDER AND GOING THROUGH THE ENTREE/APPETIZER LOOKING FOR THE ID USER ASK FOR ----------//
    //TODO: figure out how to have multiple entrees and appetizer.
    // you could add new ids(maybe it will give me an idea)
    public Orders orders(OrdersRequestBody orderRequestBody,Integer id1,Integer id2){
        List<Orders> ordersList = ordersRepository.getAllOrders();
        System.out.println("Creating my Order: " + orderRequestBody);
        // incrimating the id by one.
        Integer id = ordersList.get(ordersList.size() - 1).getId() + 1;
        //getting the orderList by the index, get the id and add one(+1) to it.
        //so that when we add new order the id won't be the same and the id number will only increase
        // getting the entree/appetizer by their ids
        Optional<EntreePlate> entreById = entreeService.getEntrePlateById(id1);
        Optional<FoodTruck2> appetizerById = appetizerService.getAppetizerById(id2);
        //Optional class is used to find out if there is a value present in this Optional instance.
        //If there is no value present in this Optional instance, then this method returns false, else true.
       if(entreById.isPresent() && appetizerById.isPresent()) {
           EntreePlate foundEntreeById = entreById.get();
           FoodTruck2 foundAppetizerById = appetizerById.get();
           //getting the appetizer/entree and assigning to found.
           ArrayList<EntreePlate> foundEntree = new ArrayList<>(Arrays.asList(foundEntreeById));
           ArrayList<FoodTruck2> foundAppetizer = new ArrayList<>(Arrays.asList(foundAppetizerById));
           //Created two list one for entrees and other for appetizer.
           Orders order = new Orders(
                   id,
                   foundEntree,
                   foundAppetizer
           );
           ordersList.add(order);
           //adding the new appetizer/entree that the user choose in the list of appetizer/entre .
           return order;
       }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
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
