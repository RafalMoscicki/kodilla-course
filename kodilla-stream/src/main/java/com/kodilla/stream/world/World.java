package com.kodilla.stream.world;

import com.kodilla.stream.sand.Europe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public final class World {

    private final Collection<Continent> continents = new ArrayList<>();

    public World() {
    }

    public void addContinent(Continent continent) {
        continents.add(continent);
    }

    public Collection<Continent> getContinents() {
        return new ArrayList<>(continents);
    }

    public final BigDecimal getPeopleQuantity() {

        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                        .map(Country::getPeopleQuantity)
                        .reduce(BigDecimal.ZERO, (sum, people) -> sum = sum.add(people));
    }
}
