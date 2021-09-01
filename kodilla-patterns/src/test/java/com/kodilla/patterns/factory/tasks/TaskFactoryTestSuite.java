package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    private TaskFactory factory = new TaskFactory();

    @Test
    void testDrivingTask() {
        //Given
        //When
        Task drive = factory.doTask(TaskFactory.DRIVING, "home", "car");
        //Then
        assertEquals("Driving to home using car", drive.executeTask());
        assertEquals("Driving", drive.getTaskName());
        assertTrue(drive.isTaskExecuted());
    }

    @Test
    void testDrivingTaskIfNotExecuted() {
        //Given
        //When
        Task drive = factory.doTask(TaskFactory.DRIVING, null, "car");
        //Then
        assertFalse(drive.isTaskExecuted());
    }

    @Test
    void testPaintingTask() {
        //Given
        //When
        Task paint = factory.doTask(TaskFactory.PAINTING, "black", "cat");
        //Then
        assertEquals("Painting cat with a black color", paint.executeTask());
        assertEquals("Painting", paint.getTaskName());
        assertTrue(paint.isTaskExecuted());
    }

    @Test
    void testPaintingTaskIfNotExecuted() {
        //Given
        //When
        Task paint = factory.doTask(TaskFactory.PAINTING, "black", null);
        //Then
        assertFalse(paint.isTaskExecuted());
    }

    @Test
    void testBuyingTask() {
        //Given
        //When
        Task buy = factory.doTask(TaskFactory.BUYING, "bread", 2.0);
        //Then
        assertEquals("Buying 2.0 bread", buy.executeTask());
        assertEquals("Buying", buy.getTaskName());
        assertTrue(buy.isTaskExecuted());
    }

    @Test
    void testBuyingTaskIfNotExecuted() {
        //Given
        //When
        Task buy = factory.doTask(TaskFactory.BUYING, null, 2.0);
        //Then
        assertFalse(buy.isTaskExecuted());
    }
}
