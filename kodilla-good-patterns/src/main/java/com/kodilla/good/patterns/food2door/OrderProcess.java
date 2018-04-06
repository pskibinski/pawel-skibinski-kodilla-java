package com.kodilla.good.patterns.food2door;

public class OrderProcess {

    private ShopInterface shopInterface;

    public OrderProcess(ShopInterface shopInterface) {
        this.shopInterface = shopInterface;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = shopInterface.orderProducts(orderRequest.getOrder());
        if(isOrdered) {
            return new OrderDto(orderRequest.getOrder(), true);
        } else {
            return new OrderDto(orderRequest.getOrder(), false);
        }
    }
}
