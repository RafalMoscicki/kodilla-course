package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.kodilla.patterns.builder.bigmac.Bun.SESAME;
import static com.kodilla.patterns.builder.bigmac.Ingredient.*;
import static com.kodilla.patterns.builder.bigmac.Ingredient.CHEESE;
import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    void testBigmacBuilder() {
        //Given When
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient(ONION)
                .ingredient(CHEESE)
                .ingredient(CHILLI)
                .bun(SESAME)
                .sauce(Sauce.BARBECUE)
                .burgers(2)
                .build();
        //Then
        assertEquals(Arrays.asList(ONION, CHEESE, CHILLI), bigmac.getIngredients());
        assertEquals(2, bigmac.getBurgers());
        assertEquals(SESAME, bigmac.getBun());
    }
}
