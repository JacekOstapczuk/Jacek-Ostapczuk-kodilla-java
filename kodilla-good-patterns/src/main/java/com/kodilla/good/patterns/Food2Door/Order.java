package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Order {

    public static Map<String, Integer> listOfOrderedProducts() {
        Map<String, Integer> listOfOrderedProducts = new HashMap<>();
        listOfOrderedProducts.put("Marchewka", 26);
        listOfOrderedProducts.put("Ser", 125);
        listOfOrderedProducts.put("Masło", 167);
        listOfOrderedProducts.put("Dynie", 197);
        listOfOrderedProducts.put("Truskawki", 34);
        listOfOrderedProducts.put("Wiśnie", 34);
    return  listOfOrderedProducts;
    }


}
