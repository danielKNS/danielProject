package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.AppetizerService;
import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Entree.Entree;
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
    private final AppetizerService appetizerService;
    private final EntreeService entreeService;
    JdbcTemplate jdbcTemplate;

    //------------------------ENTREE---------------------------//
    private final Entree entree1 = new Entree(1,"Butter Chicken",5);
    private final Entree entree2 = new Entree(2,"Palak Paneer ",3);
    ArrayList<Entree> entrees = new ArrayList<>(Arrays.asList(entree1, entree2));
    public ArrayList<Entree> getAllEntrePlates() {
        return entrees;
    }
    //-----------------------APPETIZERS------------------------//
    private final Appetizer appetizer1 = new Appetizer(1,"Garlic bread","18/22","21/22",3);
    private final Appetizer appetizer2 = new Appetizer(2,"Breadsticks ","11/22","28/22",2);
    ArrayList<Appetizer> appetizers = new ArrayList<>(Arrays.asList(appetizer1,appetizer2));
    public ArrayList<Appetizer> getAllAppetizersPlates() {
        return appetizers;
    }
    //-----------------------ORDERS--------------------------//
    private final Orders order1 = new Orders(1, entrees,appetizers);
    private final Orders order2 = new Orders(2, entrees,appetizers);
//    private final Orders order1 = new Orders(1,"name","Appetizer","Butter Chicken",5);
//    private final Orders order2 = new Orders(2,"name","Appetizer","Palak Panner",5);
//
    ArrayList<Orders> orders = new ArrayList<>(Arrays.asList(order1,order2));
//
    public ArrayList<Orders> getAllOrders(){
        return orders;
    }



    public Orders CreateNewOrder(@RequestBody NewOrderRequestBody ordersRequestBody){
        String sql = "INSERT INTO order (customer_id) VALUES (?) RETURNING *";
        Orders orders = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Orders.class),
                ordersRequestBody.getCustomerId(),
                ordersRequestBody.getAppetizerIds(),
                ordersRequestBody.getEntreeIds());
        return orders;
    }


    // to create a order i need the customer
    //get which type of appetizer/entree they want.

}
