package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie do testowania oprogramowania");

        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

        Calculator calculator = new Calculator();

        int addResult = calculator.add(2, 5);
        int subtractResult = calculator.subtract(10, 4);

        if (addResult == 7) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }

        if (subtractResult == 6) {
            System.out.println("test ok");
        } else {
            System.out.println("error");
        }
    }
}
