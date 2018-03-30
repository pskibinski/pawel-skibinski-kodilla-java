package com.kodilla.exception.test;

public class FlightRunner {
    public static void main(String[] args) {

        SearchFlights searchFlights = new SearchFlights();

        Flight flight1 = new Flight("London Heathrow", "Paris Charles de Gaulle");
        Flight flight2 = new Flight("Amsterdam", "Frankfurt");
        Flight flight3 = new Flight("Madrid Barajas", "London Heathrow");
        Flight flight4 = new Flight("Barcelona", "Munich");
        Flight flight5 = new Flight("Barcelona", "London Heathrow");

        try {
            searchFlights.findFlight(flight5);
        } catch (RouteNotFoundException e) {
            System.out.println("We are afraid but the flight is not in our base.");
        }
    }
}
