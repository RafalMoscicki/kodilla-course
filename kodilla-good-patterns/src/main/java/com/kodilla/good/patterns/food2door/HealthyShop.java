package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.Collection;

public class HealthyShop implements Producer {

    private final Collection<Product> products = new ArrayList<>();

    public HealthyShop() {
        products.add(new Product("milk"));
    }

    @Override
    public boolean process(OrderRequest order) {
        return products.contains(order.getProduct());
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
