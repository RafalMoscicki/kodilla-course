package com.kodilla.good.patterns.food2door;

public class FoodOrder {

    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest(new Product("apple"), 100, "ExtraFoodShop");
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        System.out.println(extraFoodShop.process(orderRequest));
    }
}
