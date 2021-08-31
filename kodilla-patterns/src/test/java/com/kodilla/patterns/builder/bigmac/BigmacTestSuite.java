package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredients("onion")
                .ingredients("cheese")
                .ingredients("chilli")
                .bun("sesame")
                .sauce("barbecue")
                .burgers("2")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3, howManyIngredients);
    }

    @Test
    void testIfIngredientNotAvailable() {
        try {
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .ingredients("onion")
                    .ingredients("cheese")
                    .ingredients("tomato")
                    .bun("sesame")
                    .burgers("2")
                    .build();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("tomato not available", e.getMessage());
        }
    }
}
