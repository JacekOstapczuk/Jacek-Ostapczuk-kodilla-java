package com.kodilla.patterns2.decorator.pizza;

public class ChorizoDecorator extends  AbstractPizzaOrderDecorator {

    public ChorizoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public int getCost() {
        return super.getCost() + 6;
    }

    @Override
    public String getIngredient() {
        return super.getIngredient() + "Chorizo ";
    }
}
