package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.Collection;

public class GlutenFreeShop implements Producer {

    private final Collection<Product> products = new ArrayList<>();

    public GlutenFreeShop() {
        products.add(new Product("tofu"));
    }

    @Override
    public boolean process(OrderRequest order) {
        return true;
    }

    @Override
    public String name() {
        return getClass().getSimpleName();
    }
}
