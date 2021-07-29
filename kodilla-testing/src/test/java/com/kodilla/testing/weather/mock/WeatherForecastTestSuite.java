package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    private static Map<String, Double> temperatures;

    @Mock
    private Temperatures temperaturesMock;

    @BeforeAll
    static void init() {
        temperatures = createTemperaturesMap();
    }

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperatures);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        Map<String, Double> result = weatherForecast.calculateForecast();

        //Then
        Assertions.assertEquals(5, result.size());
    }

    @Test
    void testCalculateMedianWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperatures);
        Map<String, Double> temperatures = temperaturesMock.getTemperatures();
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When

        double result = weatherForecast.calculateMedian(temperatures);

        //Then
        Assertions.assertEquals(25.5, result);
    }

    @Test
    void testCalculateAverageWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(temperatures);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateAverage(temperaturesMock.getTemperatures());

        //Then
        Assertions.assertEquals(25.56, result);
    }

    private static Map<String, Double> createTemperaturesMap () {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        return temperaturesMap;
    }
}
