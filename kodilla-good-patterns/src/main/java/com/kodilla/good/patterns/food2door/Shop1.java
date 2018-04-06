package com.kodilla.good.patterns.food2door;

public class Shop1 implements ShopInterface {

    @Override
    public boolean orderProducts(Order order) {
        if(order.getQuantity() > 1) {
            return true;
        } else {
            return false;
        }
    }

}
