package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.flights.AirportRepository;
import com.kodilla.good.patterns.flights.FlightProcessor;

import java.util.List;

public class FoodOrder {

    public static void main(String[] args) {

//        OrderRequest orderRequest = new OrderRequest(new Product("apple"), 100, "ExtraFoodShop");
//        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
//        System.out.println(extraFoodShop.process(orderRequest));

        AirportRepository airportRepository = new AirportRepository();
        FlightProcessor flightProcessor = new FlightProcessor(airportRepository);

        List<String> city = flightProcessor.findFlightTo("Gdansk");
        flightProcessor.printFlights(city);

        System.out.println("==============");

        List<String> city1 = flightProcessor.findFlightFrom("Gdansk");
        flightProcessor.printFlights(city1);
    }
}
