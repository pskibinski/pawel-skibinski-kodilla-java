package com.kodilla.good.patterns.food2door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcess orderProcess = new OrderProcess(new Shop1());
        orderProcess.process(orderRequest);
    }
}
