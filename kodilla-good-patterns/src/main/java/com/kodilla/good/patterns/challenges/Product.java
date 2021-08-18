package com.kodilla.good.patterns.challenges;

public final class Product {

    private final String name;
    private final String id;

    public Product(final String name, final String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
