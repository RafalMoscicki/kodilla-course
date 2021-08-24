package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given

        //When
        double add = calculator.add(2.2, 3.3);
        double div = calculator.div(10, 5);
        double sub = calculator.sub(10, 5);
        double mul = calculator.mul(2, 3);

        //Then
        assertEquals(5.5, add);
        assertEquals(2.0, div);
        assertEquals(5.0, sub);
        assertEquals(6.0, mul);
        assertThrows(ArithmeticException.class, () -> calculator.div(2, 0));
    }
}
