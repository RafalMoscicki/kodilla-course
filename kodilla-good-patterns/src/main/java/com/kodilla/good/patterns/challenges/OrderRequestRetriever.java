package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Pixel", "Ford", "@cat");
        Product product = new Product("Food Can", "12345");

        return new OrderRequest(user, product);
    }
}
