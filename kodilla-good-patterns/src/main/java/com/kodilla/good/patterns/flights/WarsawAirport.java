package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public final class WarsawAirport implements Airport {

    private final List<String> cities = new ArrayList<>();

    public WarsawAirport() {
        cities.add("Wroclaw");
        cities.add("Krakow");
        cities.add("Gdansk");
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
