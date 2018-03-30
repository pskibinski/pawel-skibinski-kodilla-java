package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {

        SearchFlights searchFlights = new SearchFlights();

        Flight flight = new Flight("London Gatwick", "Rome Fiumicino");

        try {
            searchFlights.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("We are afraid but the flight is not in our base.");
        }
    }
}
