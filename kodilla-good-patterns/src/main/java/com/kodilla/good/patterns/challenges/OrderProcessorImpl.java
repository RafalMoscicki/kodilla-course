package com.kodilla.good.patterns.challenges;

public class OrderProcessorImpl implements OrderProcessor {

    private final OrderRepository orderRepository;

    public OrderProcessorImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public boolean canProcess(Product product) {
        return orderRepository.getAll().containsKey(product);
    }
}
