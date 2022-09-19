package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Appetizer.AppetizerRepository;
import com.my.FoodTruckApp2.Entree.Entree;
import com.my.FoodTruckApp2.Entree.EntreeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Slf4j
public class OrdersRepository {
    private final AppetizerRepository appetizerRepository;
    private final EntreeRepository entreeRepository;
    private final JdbcTemplate jdbcTemplate;

    //    ArrayList<Orders> orders = new ArrayList<>(Arrays.asList(order1,order2));
////
//    public ArrayList<Orders> getAllOrders(){
//        return orders;
//    }
// Make an order:
    // to create a order we will need which customer is making a order ?
//Find out who placed the order:
    // so i need the customerId(taking the customerId from the requestBody)
    // to identify which customer i am serving.
    // For Example:
    // String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
    // Orders order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Orders.class),
    //  ordersRequestBody.getCustomerId());
//Find the appetizer:
    // by passing in the id and using the method gettingAppetizerById in AppetizerRepository
    // to find the id that we took in the requestBody.When we found the id we will
    // get the appetizer id and insert
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
// Find the appetizers with the ids:
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
//Find the entrees with the ids:
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
//------ figure out how to return the list of appetizers & entrees
// Get the List of appetizers:
    // we are getting back the a List of appetizers ids, we need to get THE appetizer
    //we use the method from the AppetizerRepository that we are getting the
    // appetizer by their ids. We get the appetizer and put them on a new list
    // For Example:
    // List<Appetizer> appetizerOrders = new ArrayList<>();
    // Appetizer appetizers = appetizerRepository.gettingAppetizerById(appetizerId);
    // appetizerOrders.add(appetizers);
// Get the List of entrees:
    // we are getting back the List of entrees ids, we need to get THE entree
    //we use the method from the EntreeRepository that we are getting the
    // entree by their id. We get the entree and put them on a new list
    // For Example:
    // List<Entree> entreeOrders = new ArrayList<>();
    // Entree entree = entreeRepository.gettingEntreeById(entreeId);
    // entreeOrders.add(entree);
// create a Entity:
    // we need to return a list of appetizers & entrees(The name,cost etc)
    //then we need to create a entity DTO(Data Transfer Object) to get the necessary fields
    // we need to return to the customer(the id of the order, customerId and the list of
    // appetizers & entrees(NOT THERE IDs) that the customer ordered).
    // For Example:
    //OrderDto orderDto = new OrderDto(order.getId(), ordersRequestBody.getCustomerId(),
    // appetizerOrders, entreeOrders);
//
    public OrderDto createNewOrder(NewOrderRequestBody ordersRequestBody) {
        // first when the order is created (Inserted into order) we need to find the appetizers
        String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
        Order order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Order.class),
                ordersRequestBody.getCustomerId());
        log.info("Order is Created");
        // the order is inserted now we take the appetizerId from the requestBody
        // now we need to find the id by using the method in AppetizerRepository
        log.info("Looking for the appetizers...");
        List<Appetizer> appetizerOrders = new ArrayList<>();
        List<Integer> listOfAppetizerIds = ordersRequestBody.getAppetizerIds();
        listOfAppetizerIds.forEach(appetizerId -> {
            Appetizer appetizer =
                    appetizerRepository.gettingAppetizerById(appetizerId);
            log.info("Found appetizer " + appetizer);
            appetizerOrders.add(appetizer);
            log.info("The list of appetizers the customer ordered: " + appetizerOrders);
        });
        log.info("Looking for the entrees...");
        List<Entree> entreeOrders = new ArrayList<>();
        List<Integer> listOfEntreeIds = ordersRequestBody.getEntreeIds();
        listOfEntreeIds.forEach(entreeId -> {
            Entree entree =
                    entreeRepository.gettingEntreeById((entreeId));
            log.info("Found Entree " + entree);
            entreeOrders.add(entree);
            log.info("The list of entrees the customer ordered: " + entreeOrders);
        });
        OrderDto orderDto = new OrderDto(order.getId(),
                ordersRequestBody.getCustomerId(), appetizerOrders, entreeOrders);
        return orderDto;
    }

}
