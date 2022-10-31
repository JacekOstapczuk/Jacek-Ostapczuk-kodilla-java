package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Shop_ExtraFoodShop extends Company {

    public String nameOfCompany() {
        String nameOfCompany = "ExtraFoodShop";
        return nameOfCompany;
    }

    public Map<String, Integer> listOfProducts() {
        Map<String, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put("Miód", 452);
        listOfProducts.put("Kapusta", 2356);
        listOfProducts.put("maliny", 462);
        listOfProducts.put("Jerzyny", 5733);
        listOfProducts.put("Ser", 543);
        listOfProducts.put("Buraki", 256);
        listOfProducts.put("Dynie", 1056);
        listOfProducts.put("Brzoskwinie", 463);
        listOfProducts.put("Truskawki", 446);
        return listOfProducts;
    }

    public  Map<String, Integer> process(Order order) {
        int realizedAmount;
        Map<String, Integer> orderedProducts = order.listOfOrderedProducts();
        Map<String, Integer> realizedOrder = new HashMap<>();

        for (Map.Entry<String,Integer> product : orderedProducts.entrySet()) {
            if (listOfProducts().containsKey(product.getKey())){
                int ownedAmount = listOfProducts().get(product.getKey());
                int neededAmount = product.getValue();
                if (neededAmount>ownedAmount){
                    realizedAmount = ownedAmount;
                } else {realizedAmount =neededAmount;
                }
                realizedOrder.put(product.getKey(),realizedAmount);
            }
        }
return realizedOrder;
    }
}
