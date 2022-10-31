package com.kodilla.good.patterns.Food2Door;

import java.util.Map;

public class OrderingFromProducers {
    Order order = new Order();

    public void availableProducts(Company company) {
        Map<String, Integer> realizedOrder = company.process(order);
        System.out.println("Realizacja zamówienia z sklepu: " + company.nameOfCompany() );

        for (Map.Entry<String, Integer> product : realizedOrder.entrySet()) {
            System.out.println("Zrealizowano zamówienie na: " + product.getKey() + " w ilości: " + product.getValue());
        }
        System.out.println(" ");
    }
}
