package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class NewOrderRequestBody {
    private Integer customerId;
    private Integer entreeIds;
    private List<Integer> appetizerIds;
}
