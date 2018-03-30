package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchFlights {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airports = new HashMap<>();

        String departure = flight.getDepartureAirport();
        String arrival = flight.getArrivalAirport();

        airports.put("London Heathrow", true);
        airports.put("Paris Charles de Gaulle", false);
        airports.put("Amsterdam", true);
        airports.put("Frankfurt", false);
        airports.put("Madrid Barajas", true);

        if(!airports.containsKey(departure) || !airports.containsKey(arrival)) {
            throw new RouteNotFoundException();
        }

        return true;
    }
}
