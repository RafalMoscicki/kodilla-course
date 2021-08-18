package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class OrderRepositoryImpl implements OrderRepository {

    @Override
    public Map<Product, Integer> getAll() {
        Map<Product, Integer> products = new HashMap<>();
        products.put(new Product("Food Can", "12345"), 100);
        return products;
    }
}
