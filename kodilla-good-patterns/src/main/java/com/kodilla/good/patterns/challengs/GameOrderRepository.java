package com.kodilla.good.patterns.challengs;

import java.time.LocalDateTime;

public class GameOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime dateOfOrder) {
        return true;
    }
}
