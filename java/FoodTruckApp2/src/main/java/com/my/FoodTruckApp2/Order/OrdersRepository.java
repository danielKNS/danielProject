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
import java.util.Collections;
import java.util.List;

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

    //Make an order:
    // to create a order we will need which customer is making a order ?
//Find out who placed the order:
    // so i need the customerId(taking the customerId from the requestBody)
    // to identify which customer i am serving.
    // For Example:
    // String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
    // Orders order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Orders.class),
    //  ordersRequestBody.getCustomerId());
//Find the appetizer:
    // By using the method that is created in AppetizerRepository to find the ids that
    // we took in the requestBody.When we found the id we will get the appetizer id and insert
    // For Example:
    //  Appetizer appetizers = appetizerRepository.gettingAppetizerById(ordersRequestBody.getAppetizerIds());
//Put appetizer on Receipt(database):
    // and we need to know which appetizers the customer want how
    // into appetizer_ordered.( we are using the appetizer_ordered as a receipt
    // to remind ourselves which appetizer it is and which order it is from).
    // For Example:
    // String sqlAppetizer = "INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?) RETURNING *";
    //   AppetizerOrdered appetizerOrdered = jdbcTemplate.queryForObject(sqlAppetizer,
    //   new BeanPropertyRowMapper<>(AppetizerOrdered.class),
    //   order.getId(),ordersRequestBody.getAppetizerIds());
//Find the entree:
    // By using the method that is created in EntreeRepository to find the ids that
    // we took in the requestBody.When we found the id we will get the entree id and insert
    // For Example:
    // Entree entree = entreeRepository.gettingEntreeById(ordersRequestBody.getEntreeIds());
//Put entree on Receipt(database):
    // and we need to know which entree the customer want how
    // into entree _ordered.( we are using the entree _ordered as a receipt
    // to remind ourselves which entree it is and which order it is from).
    // For Example:
    // String sqlEntree = " INSERT INTO entree_ordered(order_id ,entree_id) VALUES (?,?) RETURNING *";
    // EntreeOrdered entreeOrdered = jdbcTemplate.queryForObject(sqlEntree,
    //   new BeanPropertyRowMapper<>(EntreeOrdered.class),
    //   order.getId(),ordersRequestBody.getEntreeIds());

//----- figure out the list of appetizers & entrees
// Find the appetizers:
    // we are only getting one appetizer for now...
    // what if the customer order more than one appetizer ?.A List of appetizers .
    // first we need to change the requestBody so that we can get a LIST of appetizerId.
    // Then we need to check for EACH appetizerIds in the requestBody(we need to check
    // EACH appetizers the customer wants) and then find the appetizer
    // by using the method that is created in AppetizerRepository.
    // For Example:
    // change private Integer appetizerIds TO private List<Integer> appetizerIds
    // List<Integer> listOfAppetizerIds = ordersRequestBody.getAppetizerIds();
    //listOfAppetizerIds.forEach(appetizerId -> { Appetizer appetizers =
    // appetizerRepository.gettingAppetizerById(appetizerId)};
//Put appetizers on Receipt(database):
    // we need to know which appetizers the customer want, how
    // into appetizer_ordered.( we are using the appetizer_ordered as a receipt
    // to remind ourselves which appetizer it is and which order it is from).
    // String sqlAppetizer = "INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?) RETURNING *";
    //   AppetizerOrdered appetizerOrdered = jdbcTemplate.queryForObject(sqlAppetizer,
    //   new BeanPropertyRowMapper<>(AppetizerOrdered.class),
    //   order.getId(),appetizers.getId());
//Find the entrees:
    // we are only getting one entree for now ...
    // what if the customer order more than one entree ?. A list of entrees
    // first we need to change the requestBody so that we can get the LIST of entreeIds.
    // then we need to check for EACH entreeIds in the requestBody(Making sure that
    // EACH entree is the entree that the customer ordered) and then find the entree by
    // using the method that is created in the EntreeRepository.
    // For Example:
    //changing Integer entreeIds TO List<Integer> entreeIds
    //List<Integer> listOfEntreeIds = orderRequestBody.getEntreeIds();
    //listOfEntreeIds.forEach(entreeId -> {Entree entrees =
    // entreeRepository.gettingEntreeById(entreeIds)};
//Put entrees on Receipt(database):
    // We need to know which entrees the customer wants. and how
    // is entree_ordered is going to help ?.( we are using the entree_ordered as
    // a receipt to remind ourselves which entree it is and which order it is from).
    // For Example:
    // String sqlEntree = " INSERT INTO entree_ordered(order_id ,entree_id) VALUES (?,?) RETURNING *";
    // EntreeOrdered entreeOrdered = jdbcTemplate.queryForObject(sqlEntree,
    //   new BeanPropertyRowMapper<>(EntreeOrdered.class),
    //   order.getId(),ordersRequestBody.getEntreeIds());



    // How to find all the appetizer with the ids
    //
    // by passing in the ids and using the method gettingAppetizerById in AppetizerRepository
    // Collections.singletonList: is used to return an immutable list containing only the specified object

    public Orders CreateNewOrder(NewOrderRequestBody ordersRequestBody){
        // first when the order is created (Inserted into order) we need to find the appetizers
        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
        Orders order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Orders.class),
                ordersRequestBody.getCustomerId());
        log.info("Order is Created");
        // the order is inserted now we take the appetizerId from the requestBody
        // now we need to find the id by using the method in AppetizerRepository
        log.info("Looking for the appetizer...");
        // todo Now How do i check for each appetizerId in the list ?
        List<Integer> listOfAppetizerIds = ordersRequestBody.getAppetizerIds();
        System.out.println("List of appetizersIds: " + listOfAppetizerIds);
        listOfAppetizerIds.forEach(appetizerId -> { Appetizer appetizers =
            appetizerRepository.gettingAppetizerById(appetizerId);
            System.out.println("Found appetizer " + appetizers);
        String sqlAppetizer = " INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?) RETURNING *";
            AppetizerOrdered appetizerOrdered = jdbcTemplate.queryForObject(sqlAppetizer,
                new BeanPropertyRowMapper<>(AppetizerOrdered.class),
                order.getId(),appetizers.getId());
            log.info("Appetizer receipt: "+ appetizerOrdered);
        });

        Entree entree = entreeRepository.gettingEntreeById(ordersRequestBody.getEntreeIds());
        System.out.println("Found Entree " + entree);
        String sqlEntree = " INSERT INTO entree_ordered(order_id ,entree_id) VALUES (?,?) RETURNING *";
        EntreeOrdered entreeOrdered = jdbcTemplate.queryForObject(sqlEntree,
                new BeanPropertyRowMapper<>(EntreeOrdered.class),
                order.getId(),ordersRequestBody.getEntreeIds());
        log.info("Entree receipt: "+ entreeOrdered);

        return order;
    }

}
