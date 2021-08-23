package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class WroclawAirport implements Airport {


    private final List<String> cities = new ArrayList<>();

    public WroclawAirport() {
        cities.add("Warsaw");
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
