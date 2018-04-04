package com.kodilla.good.patterns.challengs;

import java.time.LocalDateTime;

public class GameOrderService implements OrderService {

    @Override
    public boolean order(User user, LocalDateTime dateOfOrder) {
        return true;
    }
}
