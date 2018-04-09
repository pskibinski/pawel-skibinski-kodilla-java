package com.kodilla.good.patterns.flights;

import java.util.HashMap;

public final class ListOfRoutes {

    public static HashMap<Flight, Boolean> getList() {

        final HashMap<Flight, Boolean> routes = new HashMap<>();

        routes.put(new Flight("London", "Paris"), true);
        routes.put(new Flight("Paris", "Katowice"), true);
        routes.put(new Flight("Dortmund", "Oslo"), true);
        routes.put(new Flight("Amsterdam", "Katowice"), true);
        routes.put(new Flight("Paris", "Dortmund"), true);
        routes.put(new Flight("Katowice", "Paris"), true);
        routes.put(new Flight("Oslo", "Amsterdam"), true);
        routes.put(new Flight("Katowice", "Oslo"), true);

        return new HashMap<>(routes);
    }
}
