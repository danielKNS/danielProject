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
    private final OrderRepository orderRepository;
    private final AppetizerRepository appetizerRepository;
    private final EntreeRepository entreeRepository;

    /**
     * -Make an order:
     * to create a order we will need which customer is making a order ?
     * Find out who placed the order:
     * so i need the customerId(taking the customerId from the requestBody)
     * to identify which customer i am serving.
     * For Example:
     * String sql = "INSERT INTO \"order\" (customer_id) VALUES (?) RETURNING *";
     * Orders order = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Orders.class),
     * ordersRequestBody.getCustomerId());
     * -Find the appetizer:
     * by passing in the id and using the method gettingAppetizerById in AppetizerRepository
     * to find the id that we took in the requestBody.When we found the id we will
     * get the appetizer id and insert
     * For Example:
     * Appetizer appetizers = appetizerRepository.gettingAppetizerById(ordersRequestBody.getAppetizerIds());
     * Put appetizer on Receipt(database):
     * and we need to know which appetizers the customer want how
     * into appetizer_ordered.( we are using the appetizer_ordered as a receipt
     * to remind ourselves which appetizer it is and which order it is from).
     * For Example:
     * String sqlAppetizer = "INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?) RETURNING *";
     * AppetizerOrdered appetizerOrdered = jdbcTemplate.queryForObject(sqlAppetizer,
     * new BeanPropertyRowMapper<>(AppetizerOrdered.class),
     * order.getId(),ordersRequestBody.getAppetizerIds());
     * Find the entree:
     * By using the method that is created in EntreeRepository to find the ids that
     * we took in the requestBody.When we found the id we will get the entree id and insert
     * For Example:
     * Entree entree = entreeRepository.gettingEntreeById(ordersRequestBody.getEntreeIds());
     * Put entree on Receipt(database):
     * into entree _ordered.( we are using the entree _ordered as a receipt
     * to remind ourselves which entree it is and which order it is from).
     * For Example:
     * String sqlEntree = " INSERT INTO entree_ordered(order_id ,entree_id) VALUES (?,?) RETURNING *";
     * EntreeOrdered entreeOrdered = jdbcTemplate.queryForObject(sqlEntree,
     * new BeanPropertyRowMapper<>(EntreeOrdered.class),
     * order.getId(),ordersRequestBody.getEntreeIds());
     * ----- figure out the list of appetizers & entrees
     * Find the appetizers with the ids:
     * we are only getting one appetizer for now...
     * what if the customer order more than one appetizer ?.A List of appetizers .
     * first we need to change the requestBody so that we can get a LIST of appetizerId.
     * Then we need to check for EACH appetizerIds in the requestBody(we need to check
     * EACH appetizers the customer wants) and then find the appetizer
     * by using the method that is created in AppetizerRepository.
     * For Example:
     * change private Integer appetizerIds TO private List<Integer> appetizerIds
     * List<Integer> listOfAppetizerIds = ordersRequestBody.getAppetizerIds();
     * listOfAppetizerIds.forEach(appetizerId -> { Appetizer appetizers =
     * appetizerRepository.gettingAppetizerById(appetizerId)};
     * Put appetizers on Receipt(database):
     * we need to know which appetizers the customer want, how
     * into appetizer_ordered.( we are using the appetizer_ordered as a receipt
     * to remind ourselves which appetizer it is and which order it is from).
     * String sqlAppetizer = "INSERT INTO appetizer_ordered(order_id ,appetizer_id) VALUES (?,?) RETURNING *";
     * AppetizerOrdered appetizerOrdered = jdbcTemplate.queryForObject(sqlAppetizer,
     * new BeanPropertyRowMapper<>(AppetizerOrdered.class),
     * order.getId(),appetizers.getId());
     * Find the entrees with the ids:
     * we are only getting one entree for now ...
     * what if the customer order more than one entree ?. A list of entrees
     * first we need to change the requestBody so that we can get the LIST of entreeIds.
     * then we need to check for EACH entreeIds in the requestBody(Making sure that
     * EACH entree is the entree that the customer ordered) and then find the entree by
     * using the method that is created in the EntreeRepository.
     * For Example:
     * changing Integer entreeIds TO List<Integer> entreeIds
     * List<Integer> listOfEntreeIds = orderRequestBody.getEntreeIds();
     * listOfEntreeIds.forEach(entreeId -> {Entree entrees =
     * entreeRepository.gettingEntreeById(entreeIds)};
     * Put entrees on Receipt(database):
     * We need to know which entrees the customer wants. and how
     * is entree_ordered is going to help ?.( we are using the entree_ordered as
     * a receipt to remind ourselves which entree it is and which order it is from).
     * For Example:
     * String sqlEntree = " INSERT INTO entree_ordered(order_id ,entree_id) VALUES (?,?) RETURNING *";
     * EntreeOrdered entreeOrdered = jdbcTemplate.queryForObject(sqlEntree,
     * new BeanPropertyRowMapper<>(EntreeOrdered.class),
     * order.getId(),ordersRequestBody.getEntreeIds());
     * ------ figure out how to return the list of appetizers & entrees
     * Get the List of appetizers:
     * we are getting back the a List of appetizers ids, we need to get THE appetizer
     * we use the method from the AppetizerRepository that we are getting the
     * appetizer by their ids. We get the appetizer and put them on a new list
     * For Example:
     * List<Appetizer> appetizerOrders = new ArrayList<>();
     * Appetizer appetizers = appetizerRepository.gettingAppetizerById(appetizerId);
     * appetizerOrders.add(appetizers);
     * Get the List of entrees:
     * we are getting back the List of entrees ids, we need to get THE entree
     * we use the method from the EntreeRepository that we are getting the
     * entree by their id. We get the entree and put them on a new list
     * For Example:
     * List<Entree> entreeOrders = new ArrayList<>();
     * Entree entree = entreeRepository.gettingEntreeById(entreeId);
     * entreeOrders.add(entree);
     * create a Entity:
     * we need to return a list of appetizers & entrees(The name,cost etc)
     * then we need to create a entity DTO(Data Transfer Object) to get the necessary fields
     * we need to return to the customer(the id of the order, customerId and the list of
     * appetizers & entrees(NOT THERE IDs) that the customer ordered).
     * For Example:
     * OrderDto orderDto = new OrderDto(order.getId(), ordersRequestBody.getCustomerId(),
     * appetizerOrders, entreeOrders);
     **/
    public OrderDto createNewOrder(NewOrderRequestBody ordersRequestBody) {
        Order order = orderRepository.createNewOrder(ordersRequestBody);

        appetizerRepository.createAppetizerOrders(order.getId(), ordersRequestBody.getAppetizerIds());
        List<Appetizer> appetizers = appetizerRepository.gettingAllAppetizersByIds(ordersRequestBody.getAppetizerIds());

        entreeRepository.createEntreeOrders(order.getId(), ordersRequestBody.getEntreeIds());
        List<Entree> entrees = entreeRepository.gettingAllEntreesByIds(ordersRequestBody.getEntreeIds());

        OrderDto orderDto = new OrderDto(
                order.getId(),
                ordersRequestBody.getCustomerId(),
                appetizers,
                entrees
        );
        return orderDto;
    }

    /**
     * find the order by its id AND return
     * OrderDTO(order_id,customer_id,List<Appetizer,List<Entree>)
     * first we need to find the order by using its id from the url
     * For Example:
     * String sql = "SELECT * FROM \"order\" WHERE id = ? ";
     * Order order = jdbcTemplate.queryForObject(sql,
     * new BeanPropertyRowMapper<>(Order.class),id)
     * We found the order_id, now we need to get the order id and the customerId to
     * return to the employer. OrderDto orderDto = new OrderDto(
     * order.getId() order.getCustomerId()..)
     * But we are still missing the appetizers and entrees from the order that we are
     * looking for.now we need to get the appetizers so first we need to get appetizer id.
     * -Appetizer:
     * Using appetizersOrdered, we use the order_id from order and use it to find
     * the appetizer_id,from the order we are looking for.We get the appetizer_id
     * and look for which appetizer it is by using the method gettingAppetizerById
     * and return it in the orderDto
     * try join query
     * we need to find the appetizer with the order_id
     * Select the appetizer and join with the appetizer_ordered and then we need
     * to match the id of the appetizer with the appetizerOrdered(appetizer_id)
     * then we use the appetizerOrdered(order_id) to find the appetizers with the same
     * order_id
     */
    public OrderDto gettingOrderById(Integer id) {
        log.info("getting the order with id:" + id);
        Order order = orderRepository.gettingOrderById(id);

        log.info("looking for the list of appetizers & entrees with the order id: " + id);

        List<Appetizer> appetizers = appetizerRepository.findAppetizersOrderById(id);
        log.info("The appetizers from order with id: " + id + " " + appetizers);

        List<Entree> entrees = entreeRepository.findEntreesOrderById(id);
        log.info("The entrees from order with id: " + id + " " + entrees);

        OrderDto orderDto = new OrderDto(
                order.getId(),
                order.getCustomerId(),
                appetizers,
                entrees
        );
        return orderDto;
    }

    /**
     * GO BACK AND WATCH THE VIDEO.
     * code that might help me :
     * code-
     * List<Entree> entrees = ordersRequestBody.getEntreeIds().stream().map(entreeId -> {
     * entreeRepository.createEntreeOrdered(order.getId(), entreeId);
     * return entreeRepository.gettingEntreeById(entreeId);
     * }).collect(Collectors.toList());
     * Get All orders:
     * AC(Acceptance criteria) -> we MUST return as a List<OrderDto>.
     * <p>
     * First we need to select all Orders
     * For Example:
     * String sql = "SELECT * FROM order ";
     * return JDBCTemplate.query(sql, new BeanRowMapper<>(Order.class));
     * Now that we have all the orders, we need to go for each order and
     * find their fields(order_id,customer_id,List<Appetizer>,List<Entree>).
     * For example:
     * List<OrderDto> orderDtos = orders.stream.map(order -> {}
     * Now that we are mapping throgh each order we need to get their fields.
     * first lets try to get the appetizers. to find the appetizers Forexample for order_id: 1
     * we can use the method findAppetizersOrderById using the id of the order
     * List<Appetizer> appetizers = appetizerRepository.findAppetizersOrderById(order.getId());
     * we found the appetizers for order_id: 1. Now lets find it for the entrees.
     * But we need to use the method in entreeRepository called findEntreeOrderByI
     * to get the entrees for order_id: 1.
     * List<Entree> entrees= entreeRepository.findEntreesOrderById(order.getId());
     * Now that we got the appetizers and the entrees for order_id: 1,
     * WE MUST return them as a OrderDto (For the employer).
     * For Example:
     * OrderDto orderDto = new OrderDto(
     * order.getId(),
     * order.getCustomerId(),
     * appetizers,
     * entrees
     * );
     * and put them into a list
     * For example:
     * .collect(Collectors.toList());
     * then it goes to the next iteration(order)
     * <p>
     * i think that i have a similiar problem like a N + 1 issue because when
     * i am looking for each appetizer of the order when i find one
     * i go back and iterate to find the next one
     * Is there is anyway to make it better ?
     * <p>
     * Fix our getAllOrder:
     * we should NOT loop in repo calls.
     * In another words the appetizers and entrees should NOT be in the iteration.
     * STEP 1:  first we need to get all the orders (/)Done
     * How do i go to the restaurant once ?
     * BIG Hint:
     * I need to find a way to go to the restaurant once to find all the appetizers &
     * then going to the restaurant for the second time to find all the entrees
     * (instead go there for each order to get the appetizer/entree)
     * we should find all the appetizers(we should get all the appetizers by using the
     * method gettingAllAppetizer so that we could go to the restaurant once)
     * we need to check for each appetizer by using the appetizerOrdered table
     * using the order_id and appetizer_id
     * maybe i should do that in the Database(Build a query)
     * getting the list of appetizers (ALL) then
     * we should try matching them to the order by using appetizerOrdered
     */

    public List<OrderDto> gettingAllOrders() {
//     We are getting all the orders:
        List<Order> orders = orderRepository.gettingAllOrders();

        List<Appetizer> allAppetizers = appetizerRepository.gettingALlAppetizer();
        List<Appetizer> appetizers = allAppetizers.stream().map(appetizer -> {
            appetizerRepository.findAppetizers(appetizer.getId());
        }).collect(Collectors.toList());


        List<Entree> entrees = entreeRepository.gettingAllEntree();

        List<OrderDto> orderDtos = orders.stream().map(order -> {

            OrderDto orderDto = new OrderDto(
                    order.getId(),
                    order.getCustomerId(),
                    appetizers,
                    entrees
            );
            return orderDto;
        }).collect(Collectors.toList());


        return orderDtos;
    }

    public List<OrderDto> getAllOrders() {
        List<Order> orders = orderRepository.gettingAllOrders();
        log.info("All orders: " + orders);

        List<OrderDto> orderDtos = orders.stream().map(order -> {

            List<Appetizer> appetizers = appetizerRepository.findAppetizersOrderById(order.getId());
            log.info("Appetizers: " + appetizers);

            List<Entree> entrees = entreeRepository.findEntreesOrderById(order.getId());
            log.info("Entrees: " + entrees);

            OrderDto orderDto = new OrderDto(
                    order.getId(),
                    order.getCustomerId(),
                    appetizers,
                    entrees
            );
            return orderDto;
        }).collect(Collectors.toList());
        return orderDtos;
    }

}
