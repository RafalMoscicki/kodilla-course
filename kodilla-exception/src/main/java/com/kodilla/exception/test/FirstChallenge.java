package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        try {
            double v = a / b;
            System.out.println(v);
        } catch (ArithmeticException e) {
            System.out.println("b cant be 0" + e);
        } finally {
            System.out.println("cant divide by 0");
        }
        return a / b;
    }
}
