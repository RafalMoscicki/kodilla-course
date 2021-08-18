package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    InformationService informationService;
    SendingService sendingService;
    OrderProcessor orderProcessor;

    public ProductOrderService(InformationService informationService,
                               OrderProcessor orderProcessor,
                               SendingService sendingService) {
        this.informationService = informationService;
        this.sendingService = sendingService;
        this.orderProcessor = orderProcessor;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean canProcess = orderProcessor.canProcess(orderRequest.getProduct());
        if (canProcess) {
            informationService.inform(orderRequest.getUser(), orderRequest.getProduct());
            sendingService.send(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest, true);
        } else {
            return new OrderDto(orderRequest, false);
        }
    }
}
