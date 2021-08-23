package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightProcessor {

    private AirportRepository airportRepository;

    public FlightProcessor(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<String> findFlightFrom(String city) {
        return airportRepository.getAirports().stream()
                .filter(airport -> airport.getLocation().equals(city))
                .flatMap(airport -> airport.getDestinations().stream())
                .collect(Collectors.toList());
    }

    public List<String> findFlightTo(String city) {
        return airportRepository.getAirports().stream()
                .filter(airport -> airport.getDestinations().contains(city))
                .map(airport -> airport.getLocation())
                .collect(Collectors.toList());
    }



    public void printFlights(List<String> cities) {
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
