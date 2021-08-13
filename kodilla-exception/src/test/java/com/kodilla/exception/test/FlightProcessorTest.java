package com.kodilla.exception.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FlightProcessorTest {

    private FlightProcessor testee;

    @BeforeEach
    private void initFlights() {
        testee = new FlightProcessor(createFlights());
    }

    @DisplayName("Airport not found")
    @Test
    void shouldThrowExceptionWhenAirportAbsentInMap() {
        // Given
        Flight flight = new Flight("abc", "def");

        // When
        // Then
        assertThrows(RouteNotFoundException.class, () -> testee.findFlight(flight));
    }

    @DisplayName("Cannot fly to Airport")
    @Test
    void shouldReturnFalseWhenAirportIsMappedToFalseInMap() throws RouteNotFoundException {
        // Given
        Flight flight = new Flight("abc", "Lodz");

        // When
        boolean result = testee.findFlight(flight);

        // Then
        assertFalse(result);
    }

    @DisplayName("Can fly to Airport")
    @Test
    void shouldReturnTrueWhenAirportIsMappedToTrueInMap() throws RouteNotFoundException {
        // Given
        Flight flight = new Flight("abc", "Warsaw");

        // When
        boolean result = testee.findFlight(flight);

        // Then
        assertTrue(result);
    }

    @Test
    void testFlightProcessor() {
        //Given When Then
        assertAll(
                () -> assertThrows(RouteNotFoundException.class,
                        () -> testee.findFlight(new Flight("abc", "def"))),
                () -> assertFalse(testee.findFlight(new Flight("abc", "Lodz"))),
                () -> assertTrue(testee.findFlight(new Flight("abc", "Warsaw")))
        );
    }

    private Map<String, Boolean> createFlights() {
        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Barcelona", true);
        flights.put("Lodz", false);
        return flights;
    }

}