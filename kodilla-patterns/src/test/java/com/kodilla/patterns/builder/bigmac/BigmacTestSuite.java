package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {


    @Test
    void testPizzaNew() {
        //Given
        Bigmac baranolaBurger = new Bigmac.BigmacBuilder()
                .setBun(new Bun(Bun.WITHOUTSESAME))
                .setSauce(new Sauce(Sauce.BARBECUE))
                .setBurgers(2)
                .setIngredient( new Ingredient (Ingredient.BEKON))
                        .setIngredient(new Ingredient(Ingredient.CHESSE))
                .setIngredient( new Ingredient (Ingredient.BEKON))
                .setIngredient(new Ingredient(Ingredient.CHESSE))
                        .setIngredient(new Ingredient(Ingredient.ONION))
                                .setIngredient(new Ingredient(Ingredient.MUSHROOM))
                                        .build();

        System.out.println(baranolaBurger);
        //When
        int howManyIngredients = baranolaBurger.getIngredients().size();
        //Then
        assertEquals(6, howManyIngredients);
    }
}
