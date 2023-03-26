package com.kodilla.patterns2.decorator.pizza;

public class ParmesanDecorator extends  AbstractPizzaOrderDecorator {

    public ParmesanDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + "Parmesan ";
    }
}
