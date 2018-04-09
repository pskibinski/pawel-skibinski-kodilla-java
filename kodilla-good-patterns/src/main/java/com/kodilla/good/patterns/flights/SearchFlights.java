package com.kodilla.good.patterns.flights;

import java.util.stream.Collectors;

public class SearchFlights {

    public void flightsFrom(String airport) {
        ListOfRoutes.getList().entrySet().stream()
                .map(a -> a.getKey())
                .filter(a -> a.getDepartureAirport().contains(airport))
                .forEach(System.out :: println);
    }

    public void flightsTo(String airport) {
        ListOfRoutes.getList().entrySet().stream()
                .map(a -> a.getKey())
                .filter(a -> a.getArrivalAirport().contains(airport))
                .forEach(System.out :: println);
    }

    public void flightsThrough(String dAirport, String tAirport, String aAirport) {
        String rout = ListOfRoutes.getList().entrySet().stream()
                .map(a -> a.getKey())
                .filter(a -> (a.getDepartureAirport().contains(dAirport) || a.getArrivalAirport().contains(aAirport))
                        && (a.getArrivalAirport().contains(tAirport) || a.getDepartureAirport().contains(tAirport)))
                .map(Object :: toString)
                .collect(Collectors.joining(" -> "));

        System.out.println(rout);
    }
}