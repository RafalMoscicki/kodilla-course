package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeFactoryTestSuite {

    private ShapeFactory factory = new ShapeFactory();

    @Test
    void testFactoryCircle() {
        //Given
        //When
        Shape circle = factory.makeShape(ShapeFactory.CIRCLE, 4.5);
        //Then
        assertEquals(Math.PI * Math.pow(4.5, 2.0), circle.getArea(), 0);
        assertEquals("The rounded circle", circle.getName());
    }

    @Test
    void testFactorySquare() {
        //Given
        //When
        Shape square = factory.makeShape(ShapeFactory.SQUARE, 7.0);
        //Then
        assertEquals(28.0, square.getCircumference(), 0);
        assertEquals("The angular square", square.getName());
    }

    @Test
    void testFactoryRectangle() {
        //Given
        //When
        Shape rectangle = factory.makeShape(ShapeFactory.RECTANGLE, 15.0, 2.5);
        //Then
        assertEquals(37.50, rectangle.getArea(), 0);
        assertEquals("The long rectangle", rectangle.getName());
    }
}
