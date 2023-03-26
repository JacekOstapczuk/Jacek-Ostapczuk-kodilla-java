package com.kodilla.patterns2.decorator.pizza;

public class TomatoDecorator extends AbstractPizzaOrderDecorator {

    public TomatoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 3;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + "Tomato " ;
    }
}
