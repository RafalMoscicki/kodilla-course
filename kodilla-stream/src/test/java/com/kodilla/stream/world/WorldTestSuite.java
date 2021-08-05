package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        BigDecimal polandPeople = new BigDecimal("38000000");
        Country poland = new Country("Poland", polandPeople);
        BigDecimal germanyPeople = new BigDecimal("80000000");
        Country germany = new Country("Germany", germanyPeople);
        BigDecimal slovakiaPeople = new BigDecimal("5000000");
        Country slovakia = new Country("Slovakia", slovakiaPeople);
        Collection<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(germany);
        europeCountries.add(slovakia);

        Collection<Country> asiaCountries = new ArrayList<>();
        BigDecimal chinaPeople = new BigDecimal("1500000000");
        asiaCountries.add(new Country("China", chinaPeople));

        Continent europe = new Continent("Europe", europeCountries);
        Continent asia = new Continent("Asia", asiaCountries);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Then
        BigDecimal expected = new BigDecimal("1623000000");
        assertEquals(2, world.getContinents().size());
        assertEquals(expected, result);
    }
}
