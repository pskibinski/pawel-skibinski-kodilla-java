package com.kodilla.good.patterns.flights;

public class Application {
    public static void main(String[] args) {
        SearchFlights searchFlights = new SearchFlights();
        searchFlights.flightsFrom("Amsterdam");
        searchFlights.flightsTo("Oslo");
        searchFlights.flightsThrough("London", "Paris", "Katowice");
    }
}
