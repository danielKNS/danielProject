package com.my.FoodTruckApp2.Order;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class NewOrderRequestBody {
    private Integer customerId;
    private List<Integer> entreeIds;
    private List<Integer> appetizerIds;
}
