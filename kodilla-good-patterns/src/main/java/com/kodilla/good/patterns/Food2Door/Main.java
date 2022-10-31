package com.kodilla.good.patterns.Food2Door;

public class Main {
    public static void main(String[] args) {

        OrderingFromProducers orderingFromProducers = new OrderingFromProducers();
        Shop_ExtraFoodShop shop_extraFoodShop = new Shop_ExtraFoodShop();
        orderingFromProducers.availableProducts(shop_extraFoodShop);

        Shop_GlutenFreeShop shop_glutenFreeShop =  new Shop_GlutenFreeShop();
        orderingFromProducers.availableProducts(shop_glutenFreeShop);

        Shop_HealthyShop shop_healthyShop = new Shop_HealthyShop();
        orderingFromProducers.availableProducts( shop_healthyShop );
    }
}
