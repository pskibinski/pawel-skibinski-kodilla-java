package com.kodilla.good.patterns.challengs;

public class Application {
    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new GameInformationService(), new GameOrderService(), new GameOrderRepository());
        productOrderService.process(orderRequest);
    }

}
