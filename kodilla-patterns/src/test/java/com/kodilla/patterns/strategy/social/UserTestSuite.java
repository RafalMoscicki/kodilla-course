package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User millenial = new Millenials("John");
        User zGeneration = new ZGeneration("Mike");
        User yGeneration = new YGeneration("Mitch");

        //When
        String john = millenial.sharePost();
        String mike = zGeneration.sharePost();
        String mitch = yGeneration.sharePost();

        //Then
        assertEquals(john, "You are using Snapchat");
        assertEquals(mike, "You are using Twitter");
        assertEquals(mitch, "You are using Facebook");
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User millenial = new Millenials("John");

        //When
        String john = millenial.sharePost();
        millenial.setSocialPublisher(new TwitterPublisher());
        john = millenial.sharePost();

        //Then
        assertEquals(john, "You are using Twitter");
    }
}
