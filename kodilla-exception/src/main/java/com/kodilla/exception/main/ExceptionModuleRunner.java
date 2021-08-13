package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.io.FileReaderWithoutHandling;
import com.kodilla.exception.test.*;

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

        UserInputChecker userInputChecker = new UserInputChecker();
        try {
            System.out.println(userInputChecker.scan("7"));
        } catch (InvalidFormatException | NumberOutOfRangeException e) {
            e.printStackTrace();
        }
    }
}
