package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class GdanskAirport implements Airport {

    private final List<String> cities = new ArrayList<>();

    public GdanskAirport() {
        cities.add("Wroclaw");
        cities.add("Krakow");
        cities.add("Warsaw");
    }

    @Override
    public List<String> getDestinations() {
        return new ArrayList<>(cities);
    }

    @Override
    public String getLocation() {
        return getClass().getSimpleName();
    }
}
