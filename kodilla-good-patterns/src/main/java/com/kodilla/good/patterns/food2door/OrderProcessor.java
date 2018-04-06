package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private ShopInterface shopInterface;
    private InformationService informationService;

    public OrderProcessor(ShopInterface shopInterface, InformationService informationService) {
        this.shopInterface = shopInterface;
        this.informationService = informationService;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = shopInterface.orderProducts(orderRequest.getOrder());
        if(isOrdered) {
            informationService.sendMsg();
            return new OrderDto(orderRequest.getOrder(), true);
        } else {
            return new OrderDto(orderRequest.getOrder(), false);
        }
    }
}
