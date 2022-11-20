package com.kodilla.patterns.builder.bigmac;

public class Ingredient {

    public static final String SALAD = "salad";
    public static final String ONION= "onion";
    public static final String BEKON = "bekon";
    public static final String CHILLI = "chilli";
    public static final String MUSHROOM = "mushroom";
    public static final String PRAWN = "prawn";
    public static final String CHESSE = "chesse";

    private final String ingredient;

    public Ingredient(String  ingredient) {
        if ( ingredient.equals(SALAD) || ingredient.equals(ONION)|| ingredient.equals(BEKON)
        ||ingredient.equals(CHILLI) || ingredient.equals(MUSHROOM)|| ingredient.equals(PRAWN) || ingredient.equals(CHESSE)) {
            this.ingredient =  ingredient;
        } else {
            throw new IllegalStateException("Chosen bun should be WITHSESAME or WITHOUTSESAME!");
        }
    }
    public String getIngredients() {
        return ingredient;
    }

    @Override
    public String toString() {
        return  ingredient;
    }
}
