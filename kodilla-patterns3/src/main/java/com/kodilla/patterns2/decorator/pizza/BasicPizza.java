package com.kodilla.patterns2.decorator.pizza;

public  class BasicPizza implements  PizzaOrder {

    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String getIngredient() {
        return "Pizza z Sosem, Serem ";
    }
}
