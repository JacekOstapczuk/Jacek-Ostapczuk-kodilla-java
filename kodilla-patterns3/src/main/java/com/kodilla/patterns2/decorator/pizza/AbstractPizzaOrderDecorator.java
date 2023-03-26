package com.kodilla.patterns2.decorator.pizza;

public class AbstractPizzaOrderDecorator implements PizzaOrder {

    private final PizzaOrder pizzaOrder;

    protected AbstractPizzaOrderDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public int getCost() {
        return pizzaOrder.getCost();
    }

    @Override
    public String getIngredient() {
        return pizzaOrder.getIngredient();
    }

}
