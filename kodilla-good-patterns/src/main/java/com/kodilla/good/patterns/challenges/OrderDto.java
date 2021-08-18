package com.kodilla.good.patterns.challenges;

public class OrderDto {

    public OrderRequest request;
    public boolean isAvailable;

    public OrderDto(OrderRequest request, boolean isAvailable) {
        this.request = request;
        this.isAvailable = isAvailable;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
