package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGerAverage() {
        //Given
        int[] numbers = {1, 3, 5, 8, 2};

        //Then
        assertEquals(3.8, ArrayOperations.getAverage(numbers), 0.001);
    }
}
