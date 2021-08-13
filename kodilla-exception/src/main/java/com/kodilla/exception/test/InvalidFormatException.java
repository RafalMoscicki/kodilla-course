package com.kodilla.exception.test;

public class InvalidFormatException extends Exception {

    public InvalidFormatException() {
    }

    public InvalidFormatException(String input) {
        super("Input '" + input + "' is not a number");
    }
}
