package com.kodilla.exception.test;

public class NumberOutOfRangeException extends Exception {

    public NumberOutOfRangeException(String input) {
        super("input '" + input + "' is out of range of 0-9");
    }
}
