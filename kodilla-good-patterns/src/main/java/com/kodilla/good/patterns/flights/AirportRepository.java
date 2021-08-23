package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class AirportRepository {

    private final List<Airport> airports = new ArrayList<>();

    public AirportRepository() {
        airports.add(new WarsawAirport());
        airports.add(new GdanskAirport());
        airports.add(new WroclawAirport());
    }

    public List<Airport> getAirports() {
        return new ArrayList<>(airports);
    }
}
