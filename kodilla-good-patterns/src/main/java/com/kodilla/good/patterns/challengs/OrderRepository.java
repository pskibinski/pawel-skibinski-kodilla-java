package com.kodilla.good.patterns.challengs;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(User user, LocalDateTime dateOfOrder);
}
