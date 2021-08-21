package com.kodilla.good.patterns.food2door;

public class OrderRequest {

    private Product product;
    private int quantity;
    private String producerName;

    public OrderRequest(Product product, int quantity, String producerName) {
        this.product = product;
        this.quantity = quantity;
        this.producerName = producerName;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProducerName() {
        return producerName;
    }
}
