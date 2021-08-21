package com.kodilla.good.patterns.food2door;

import java.util.Collection;

public class Shop {

    private final Collection<Producer> producers;

    public Shop(Collection<Producer> producers) {
        this.producers = producers;
    }

    public OrderDto realize(OrderRequest order) {

        for (Producer producer : producers) {
            if (producer.name().equals(order.getProducerName())) {
                boolean processResult = producer.process(order);
                return new OrderDto(order, processResult);
            }
        }
        return new OrderDto(order, false);



//        Boolean isRealized = producers.stream()
//                .filter(producer -> producer.name().equals(order.getProducerName()))
//                .findFirst()
//                .map(producer -> producer.process(order))
//                .orElse(false);
//        return new OrderDto(order, isRealized);
    }

}
