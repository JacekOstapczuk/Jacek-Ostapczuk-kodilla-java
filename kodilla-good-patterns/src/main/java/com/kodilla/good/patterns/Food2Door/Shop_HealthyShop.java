package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Shop_HealthyShop extends Company {

    public String nameOfCompany(){
        String nameOfCompany = "HealthyShop";
        return nameOfCompany;
    }

    public Map<String, Integer> listOfProducts() {
        Map<String, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put("Pomidor",733);
        listOfProducts.put("Marchewka", 156);
        listOfProducts.put("Bakłarzan", 424);
        listOfProducts.put("Jabłka", 462);
        listOfProducts.put("Masło", 266);
        listOfProducts.put("Ser", 667);
        listOfProducts.put("Śliwki", 146);
        listOfProducts.put("Dynie", 24);
        listOfProducts.put("Wiśnie", 754);
        listOfProducts.put("Truskawki", 85);
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
                realizedOrder.put(product.getKey(),realizedAmount );
            }
        }
        return realizedOrder;
    }
}
