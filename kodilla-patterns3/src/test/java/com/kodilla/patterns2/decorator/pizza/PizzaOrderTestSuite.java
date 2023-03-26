package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaPrice() {
        //Given
        PizzaOrder basicOrder = new BasicPizza();

        //When
        int pizzaPrice = basicOrder.getCost();

        //Then
        assertEquals(15, pizzaPrice);
        System.out.println(basicOrder.getIngredient() + " kosztuje " + basicOrder.getCost());
    }

    @Test
    public void testMeatPizzaPrice() {
        //Given
        PizzaOrder meatOrder = new BasicPizza();
        meatOrder = new HamDecorator(meatOrder);
        meatOrder = new ChorizoDecorator(meatOrder);

        //When
        int pizzaPrice = meatOrder.getCost();

        //Then
        assertEquals(26, pizzaPrice);
        System.out.println(meatOrder.getIngredient() + " kosztuje " + meatOrder.getCost());
    }


    @Test
    public void testVeganPizzaPrice() {
        //Given
        PizzaOrder veganOrder = new BasicPizza();
        veganOrder = new TomatoDecorator(veganOrder);
        veganOrder = new ParmesanDecorator(veganOrder);
        //When
        int pizzaPrice = veganOrder.getCost();

        //Then
        assertEquals(23, pizzaPrice);
        System.out.println(veganOrder.getIngredient() + " kosztuje " + veganOrder.getCost());
    }


    @Test
    public void testTastyPizzaPrice() {
        //Given
        PizzaOrder tastyOrder = new BasicPizza();
        tastyOrder = new TomatoDecorator(tastyOrder);
        tastyOrder = new ChorizoDecorator(tastyOrder);
        tastyOrder = new ParmesanDecorator(tastyOrder);

        //When
        int pizzaPrice = tastyOrder.getCost();

        //Then
        assertEquals(29, pizzaPrice);
        System.out.println(tastyOrder.getIngredient() + " kosztuje " +tastyOrder.getCost());
    }





}
