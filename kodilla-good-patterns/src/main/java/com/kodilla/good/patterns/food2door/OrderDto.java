package com.kodilla.good.patterns.food2door;

public class OrderDto {

    public OrderRequest request;
    public boolean isRealized;

    public OrderDto(OrderRequest request, boolean isRealized) {
        this.request = request;
        this.isRealized = isRealized;
    }

    public boolean isRealized() {
        return isRealized;
    }
}
