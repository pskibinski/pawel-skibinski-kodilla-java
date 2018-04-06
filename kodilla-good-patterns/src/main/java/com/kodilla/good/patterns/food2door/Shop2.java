package com.kodilla.good.patterns.food2door;

public class Shop2 implements ShopInterface {

    @Override
    public boolean orderProducts(Order order) {
        if(order.getQuantity() > 3) {
            return true;
        } else {
            return false;
        }
    }
}
