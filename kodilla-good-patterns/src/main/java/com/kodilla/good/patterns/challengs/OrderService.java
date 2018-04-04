package com.kodilla.good.patterns.challengs;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(User user, LocalDateTime dateOfOrder);

}
