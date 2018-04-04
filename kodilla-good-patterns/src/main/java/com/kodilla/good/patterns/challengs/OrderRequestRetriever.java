package com.kodilla.good.patterns.challengs;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Smith");
        LocalDateTime dateOfOrder = LocalDateTime.now();

        return new OrderRequest(user, dateOfOrder);
    }

}
