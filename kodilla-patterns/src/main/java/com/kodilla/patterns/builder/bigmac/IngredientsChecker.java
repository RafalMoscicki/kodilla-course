package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class IngredientsChecker {

    protected boolean availableIngredients(String ingredient) {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("lettuce");
        ingredients.add("onion");
        ingredients.add("bacon");
        ingredients.add("cucumber");
        ingredients.add("chilli");
        ingredients.add("mushrooms");
        ingredients.add("prawns");
        ingredients.add("cheese");
        return ingredients.contains(ingredient);
    }

    protected boolean availableSauce(String sauce) {
        List<String> sauces = new ArrayList<>();
        sauces.add("standard");
        sauces.add("1000 island");
        sauces.add("barbecue");
        return sauces.contains(sauce);
    }
}
