package com.my.FoodTruckApp2.Order;

import com.my.FoodTruckApp2.Appetizer.Appetizer;
import com.my.FoodTruckApp2.Entree.Entree;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {
    private Integer id;
    private Integer customerId;
    private List<Appetizer> appetizers;
    private List<Entree> entrees;
}
