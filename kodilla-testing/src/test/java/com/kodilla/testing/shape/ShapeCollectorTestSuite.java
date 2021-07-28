package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("processes on list of shapes: adding and removing")
    class TestProcessingList {

        @Test
        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addShape(new Circle(2.05));

            //Then
            Assertions.assertEquals(Arrays.asList(new Circle(2.05)), shapeCollector.getShapes());
        }

        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(3.05);
            shapeCollector.addShape(square);

            //When
            boolean result = shapeCollector.removeShape(square);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapes().size());
        }
    }

    @Nested
    @DisplayName("printing informations about shapes")
    class TestShow {

        @Test
        void testRetrieveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(5.09);
            shapeCollector.addShape(shape);

            //When
            Shape retrieveShape = shapeCollector.retrieveShape(0);

            //Then
            Assertions.assertEquals(shape, retrieveShape);
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square(5.09);
            Shape circle = new Circle(2.0);
            Shape triangle = new Triangle(3.5, 2.0);
            shapeCollector.addShape(square);
            shapeCollector.addShape(circle);
            shapeCollector.addShape(triangle);

            //When
            String result = "Square(5.09),Circle(2.0),Triangle(3.5,2.0)";

            //Then
            Assertions.assertEquals(result, shapeCollector.show());
        }
    }
}
