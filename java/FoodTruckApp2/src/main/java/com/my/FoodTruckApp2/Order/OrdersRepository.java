package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.AppetizerRepository;
import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Entree.Entree;
import com.my.FoodTruckApp2.Entree.EntreeRepository;
import com.my.FoodTruckApp2.Entree.EntreeService;
import com.my.FoodTruckApp2.Order.Orders;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Arrays;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrdersRepository {
    private final AppetizerRepository appetizerRepository;
    private final EntreeRepository entreeRepository;
    private final JdbcTemplate jdbcTemplate;

    //------------------------ENTREE---------------------------//
//    private final Entree entree1 = new Entree(1,"Butter Chicken",5);
//    private final Entree entree2 = new Entree(2,"Palak Paneer ",3);
//    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));
//    public ArrayList<Entree> getAllEntrePlates() {
//        return entrees;
//    }
//    //-----------------------APPETIZERS------------------------//
//    private final Appetizer appetizer1 = new Appetizer(1,"Garlic bread","18/22","21/22",3);
//    private final Appetizer appetizer2 = new Appetizer(2,"Breadsticks ","11/22","28/22",2);
//    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));
//    public ArrayList<Appetizer> getAllAppetizersPlates() {
//        return appetizers;
//    }
//    //-----------------------ORDERS--------------------------//
//    private final Orders order1 = new Orders(1, 2,entrees,appetizers);
//    private final Orders order2 = new Orders(2, 2,entrees,appetizers);
////    private final Orders order1 = new Orders(1,"name","Appetizer","Butter Chicken",5);
////    private final Orders order2 = new Orders(2,"name","Appetizer","Palak Panner",5);
////
//    ArrayList<Orders> orders = new ArrayList<>(Arrays.asList(order1,order2));
////
//    public ArrayList<Orders> getAllOrders(){
//        return orders;
//    }
    //Create Order :
    // the RequestBody needs three fields customerId, List of appetizerIds & entreeIds
    // the PK is not necessary because is  autoIncreameting.
    // to create a order we will need which customer is making a order
    // and we need to know which appetizers & entree the customer want.
    // the SQL query will INSERT  customerId and the first variable for the fields
    // the JdbcTemplate.queryForObject will map and through the DataBase then
    // the second variable will be the list of integers for entree ids to find which entree id
    // that matches with the entree the customers wants by using a method we made in entreeRepository
    // to find which entree the customer wants and will return a list of entrees. Same for the appetizer
    // the final variable is for the list of integers of appetizers ids to find which appetizer id
    // that matches with the appetizer the customers wants by using a method we made in appetizerRepository
    // to find which appetizer the customer wants and will return a list of appetizer.
    // at the end if an id does not exist or is not found
    // we will return a HTTP NOT FOUND.

    // How to find all the appetizer with the ids
    //
    // by passing in the ids and using the method gettingAppetizerById in AppetizerRepository

    public Orders CreateNewOrder(NewOrderRequestBody ordersRequestBody){
        // first when the order is created (Inserted into order) we need to find the appetizers
        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
        Orders order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Orders.class),
                ordersRequestBody.getCustomerId());
        log.info("Order is Created");
        // the order is inserted now we take the appetizerId from the requestBody
        // now we need to find the id by using the method in AppetizerRepository
        Appetizer appetizer = appetizerRepository.gettingAppetizerById(ordersRequestBody.getAppetizerIds());
        System.out.println("Found appetizer " + appetizer);
        log.info("Looking for the appetizer...");
        // now we use the appetizer_ordered
        // Insert into the appetizer_ordered because we are using the table as a receipt
        // (to remind ourselves which appetizer it is and which order it is from)
        String sqlAppetizer = " INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?) RETURNING *";
        AppetizerOrdered appetizerOrdered = jdbcTemplate.queryForObject(sqlAppetizer,
                new BeanPropertyRowMapper<>(AppetizerOrdered.class),
                order.getId(),ordersRequestBody.getAppetizerIds());
        log.info("Appetizer receipt: "+ appetizerOrdered);

        return order;
    }

}
