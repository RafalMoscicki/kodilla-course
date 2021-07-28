package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage(Map<String, Double> temperatures) {
        if (temperatures.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (Map.Entry<String, Double> temperature : temperatures.entrySet()) {
                sum = sum + temperature.getValue();
            }
            return sum / (temperatures.size());
        }
    }

    private List<Double> sort(Map<String, Double> numbers) {
        List<Double> mapValues = new ArrayList<>(numbers.values());
        Collections.sort(mapValues);
        return mapValues;
    }

    public double calculateMedian(Map<String, Double> temperatures) {
        if (temperatures.isEmpty()) {
            return 0;
        } else {
            List<Double> sortedTemperatures = sort(temperatures);
            int size = sortedTemperatures.size();
            if (size % 2 == 0) {
                return (sortedTemperatures.get((size / 2) - 1) + sortedTemperatures.get(size / 2)) / 2;
            } else {
                return sortedTemperatures.get((size / 2));
            }
        }
    }
}
