package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        Order order = new Order("Apples", 100);

        return new OrderRequest(order);
    }

}
