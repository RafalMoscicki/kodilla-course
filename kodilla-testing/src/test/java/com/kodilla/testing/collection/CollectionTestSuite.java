package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When empty list is created should return true after checking if list is empty")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(new ArrayList<>());

        //Then
        Assertions.assertTrue(result.isEmpty());
    }

    @DisplayName("When creating ArrayList should return List with odd numbers only")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> numbers = Arrays.asList(5, 7, 0, 10, 12, 1);
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> result = oddNumbersExterminator.exterminate(numbers);

        //When
        List<Integer> expectedResult = Arrays.asList(0, 10, 12);

        //Then
        Assertions.assertEquals(result, expectedResult);
    }
}
