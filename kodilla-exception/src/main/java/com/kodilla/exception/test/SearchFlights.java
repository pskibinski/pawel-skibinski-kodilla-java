package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<Flight, Boolean> airports = new HashMap<>();

        Flight flight1 = new Flight("London Heathrow", "Paris Charles de Gaulle");
        Flight flight2 = new Flight("Amsterdam", "Frankfurt");
        Flight flight3 = new Flight("Madrid Barajas", "London Heathrow");
        Flight flight4 = new Flight("Barcelona", "Munich");
        Flight flight5 = new Flight("Barcelona", "London Heathrow");

        airports.put(flight1, true);
        airports.put(flight2, true);
        airports.put(flight3, true);
        airports.put(flight4, false);
        airports.put(flight5, false);

       long contains = airports.entrySet().stream().filter(a -> a.getKey().equals(flight)).count();

       if(contains < 1) {
           throw new RouteNotFoundException();
       }

    }
}
