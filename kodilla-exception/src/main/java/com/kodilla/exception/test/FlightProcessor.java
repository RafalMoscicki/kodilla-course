package com.kodilla.exception.test;

import java.util.Map;

public class FlightProcessor {

    private final Map<String, Boolean> flights;

    public FlightProcessor(Map<String, Boolean> flights) {
        this.flights = flights;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        if (flights.containsKey(flight.getArrivalAirport())) {
            return flights.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException("Route to " + flight.getArrivalAirport() + " not found");
        }
    }
}
