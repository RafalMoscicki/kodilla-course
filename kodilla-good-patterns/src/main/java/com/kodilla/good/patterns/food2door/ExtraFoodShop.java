package com.kodilla.good.patterns.food2door;

import java.util.*;

public class ExtraFoodShop implements Producer {

    private final Map<Product, Integer> products;

    public ExtraFoodShop() {
        products = new HashMap<>();
        products.put(new Product("apple"), 100);
    }

    @Override
    public boolean process(OrderRequest order) {
        Integer quantity = products.get(order.getProduct());
        if (quantity == null) {
            return false;
        }

        if (order.getQuantity() <= quantity) {
            products.put(order.getProduct(), quantity - order.getQuantity());
            return true;
        }
        return false;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
