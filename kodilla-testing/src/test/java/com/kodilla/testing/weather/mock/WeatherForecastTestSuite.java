package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {

    private Map<String, Double> createTemperaturesMap () {
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        return temperaturesMap;
    }

    private double calculateAverageOfMock() {
        Map<String, Double> tempMap = createTemperaturesMap();
        double sum = 0;
        for (Double temp : tempMap.values()) {
            sum = sum + temp;
        }
        return sum / tempMap.size();
    }

    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(createTemperaturesMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMedianWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(createTemperaturesMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double result = weatherForecast.calculateMedian(temperaturesMock.getTemperatures());

        //Then
        Assertions.assertEquals(25.5, result);
    }

    @Test
    void testCalculateAverageWithMock() {
        //Given
        when(temperaturesMock.getTemperatures()).thenReturn(createTemperaturesMap());
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        temperaturesMock.getTemperatures();

        //When
        double result = weatherForecast.calculateAverage(temperaturesMock.getTemperatures());
        double expectedResult = calculateAverageOfMock();
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
