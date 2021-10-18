package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaOrderCostWithCheeseHamMushrooms() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrder(theOrder);
        theOrder = new ExtraHamOrder(theOrder);
        theOrder = new ExtraMushroomOrder(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal("30.00"), theCost);
    }

    @Test
    public void testPizzaOrderDescriptionWithCheeseHamMushrooms() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseOrder(theOrder);
        theOrder = new ExtraHamOrder(theOrder);
        theOrder = new ExtraMushroomOrder(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Basic crust with tomato sauce extra cheese extra ham extra mushrooms", description);
    }
}
