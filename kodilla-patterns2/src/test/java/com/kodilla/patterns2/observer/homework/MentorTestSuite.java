package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MentorTestSuite {

    @Test
    public void updateTest() {
        //Given
        Mentor adam = new Mentor("AdamKodilla");
        Mentor piotr = new Mentor("PiotrKodilla");
        Task module20 = new Task("Module 20");
        Task support = new Task("Support");
        module20.registerObserver(adam);
        support.registerObserver(piotr);

        //When
        module20.addTask("Decorator Task");
        module20.addTask("Facade Task");
        support.addTask("help with gradle");
        support.addTask("make new repository");
        support.addTask("add key to git");

        //Then
        assertEquals(2, adam.getUpdateCount());
        assertEquals(3, piotr.getUpdateCount());
    }

}