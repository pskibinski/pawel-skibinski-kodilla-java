package com.kodilla.good.patterns.food2door;

public class OrderDto {

    private Order order;
    private boolean isOrdered;

    public OrderDto(Order order, boolean isOrdered) {
        this.order = order;
        this.isOrdered = isOrdered;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
