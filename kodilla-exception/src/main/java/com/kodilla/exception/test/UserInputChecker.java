package com.kodilla.exception.test;

public class UserInputChecker {

    private static int MAX = 9;
    private static int MIN = 0;

    public int scan(String input) throws InvalidFormatException, NumberOutOfRangeException {
        int ret;
        try {
            ret = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidFormatException(input);
        }
        if (ret < MIN || ret > MAX) {
            throw new NumberOutOfRangeException(input);
        }
        return ret;
    }
}
