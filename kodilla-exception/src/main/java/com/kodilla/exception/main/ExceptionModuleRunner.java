package com.kodilla.exception.main;

import com.kodilla.exception.test.*;

import java.util.HashMap;
import java.util.Map;

public class ExceptionModuleRunner {

    public static void main(String[] args) {

//        FileReader fileReader = new FileReader();
//
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading a file");
//        }
//
//        FirstChallenge firstChallenge = new FirstChallenge();
//        try {
//            double result = firstChallenge.divide(3, 0);
//            System.out.println(result);
//        } catch (ArithmeticException e) {
//            System.out.println("Nie dziel przez zero");
//        }
//
//        ExceptionHandling exceptionHandling = new ExceptionHandling();
//        exceptionHandling.handle(10, 5);

//        UserInputChecker userInputChecker = new UserInputChecker();
//        try {
//            System.out.println(userInputChecker.scan("7"));
//        } catch (InvalidFormatException | NumberOutOfRangeException e) {
//            e.printStackTrace();
//        }

        Map<String, Boolean> flights = new HashMap<>();
        flights.put("Warsaw", true);
        flights.put("Barcelona", true);
        flights.put("lodz", false);

        Flight flight = new Flight("Warsaw", "Barcelona");
        FlightProcessor flightProcessor = new FlightProcessor(flights);
        try {
            System.out.println(flightProcessor.findFlight(flight));
        } catch (RouteNotFoundException e) {
            e.printStackTrace();
        }

    }
}
