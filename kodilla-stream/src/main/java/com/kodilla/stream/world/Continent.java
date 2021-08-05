package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.Collection;

public final class Continent {

    private final String name;
    private final Collection<Country> countries;

    public Continent(final String name, final Collection<Country> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public Collection<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}
