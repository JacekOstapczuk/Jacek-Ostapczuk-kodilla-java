package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    Bun bun;
    int burgers;
    Sauce sauce;
    List<Ingredient> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        Bun bun;
        int burgers;
        Sauce sauce;
        List<Ingredient> ingredients = new ArrayList<>();

        public BigmacBuilder setBun(Bun bun) {
            this.bun = bun;
            return this;
        }

        public BigmacBuilder setBurgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder setSauce(Sauce sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder setIngredient(Ingredient ingredient) {
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }
    }
        private Bigmac(Bun bun, int burgers, Sauce sauce, List <Ingredient> ingredients) {
            this.bun = bun;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = new ArrayList<>(ingredients);
        }

    public Bun getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun=" + bun +
                ", burgers=" + burgers +
                ", sauce=" + sauce +
                ", ingredients=" + ingredients +
                '}';
    }
}