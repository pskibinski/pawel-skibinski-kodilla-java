package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {

    private final String bun;
    private final double burgers;
    private final String sauce;
    private List<String> ingredients;

    private Bigmac(String bun, double burgers, String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public double getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public static class BigmacBuilder {

        private String bun;
        private double burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun) {
            if (bun.equals("poppy-seed") || bun.equals("ordinary")) {
                this.bun = bun;
                return this;
            } else {
                throw new IllegalStateException("Only poppy-seed bun or ordinary bun are available");
            }
        }

        public BigmacBuilder burgers(double burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            if(sauce.equals("standard") || sauce.equals("Thousand Islands") || sauce.equals("barbecue")) {
                this.sauce = sauce;
                return this;
            } else {
                throw new IllegalStateException("Only standard, Thousand Islands and barbecue sauce are available.");
            }
        }

        public BigmacBuilder ingredient(String ingredient) {
            if(ingredient.equals("salad") || ingredient.equals("onion") || ingredient.equals("bacon")
                    || ingredient.equals("cucumber") || ingredient.equals("chili pepper") || ingredient.equals("mushrooms")
                    || ingredient.equals("prawns") || ingredient.equals("cheese")) {
                ingredients.add(ingredient);
                return this;
            } else {
                throw new IllegalStateException("Only salad, onion, bacon, cucumber, chili pepper, mushrooms, prawns and cheese are available.");
            }
        }

            public Bigmac build () {
                return new Bigmac(bun, burgers, sauce, ingredients);
            }
        }

        @Override
        public String toString() {
            return "Bigmac{" +
                    "bun='" + bun + '\'' +
                    ", burgers=" + burgers +
                    ", sauce='" + sauce + '\'' +
                    ", ingredients=" + ingredients +
                    '}';
        }
    }
