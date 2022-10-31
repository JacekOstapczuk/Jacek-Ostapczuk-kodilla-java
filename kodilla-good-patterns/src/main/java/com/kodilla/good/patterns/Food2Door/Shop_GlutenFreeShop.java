package com.kodilla.good.patterns.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Shop_GlutenFreeShop extends Company {

    public String nameOfCompany(){
        String nameOfCompany = "GlutenFreeShop";
        return nameOfCompany;
    }

    public Map <String, Integer>listOfProducts() {
        Map<String, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put("Pomidor",15);
        listOfProducts.put("Marchewka", 540);
        listOfProducts.put("Sałata", 560);
        listOfProducts.put("Rzodekiewki", 590);
        listOfProducts.put("Masło", 236);
        listOfProducts.put("Ser", 935);
        listOfProducts.put("Jajka", 168);
        listOfProducts.put("Dynie", 1056);
        listOfProducts.put("Ogórki", 16);
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
                realizedOrder.put(product.getKey(),realizedAmount );
            }
        }
        return realizedOrder;
    }
}
