package com.kodilla.good.patterns.challenges;

public class ChallengesMain {

    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        movieStore.printMovies();

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new MailService(), new OrderProcessorImpl(new OrderRepositoryImpl()), new Sender());
        productOrderService.process(orderRequest);
    }
}
