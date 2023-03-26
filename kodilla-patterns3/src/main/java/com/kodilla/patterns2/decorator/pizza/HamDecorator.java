package com.kodilla.patterns2.decorator.pizza;

public class HamDecorator extends  AbstractPizzaOrderDecorator {

    public HamDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 5;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + "Ham ";
    }
}
