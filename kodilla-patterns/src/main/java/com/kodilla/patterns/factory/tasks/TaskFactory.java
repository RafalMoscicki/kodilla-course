package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public final static String DRIVING = "DRIVING";
    public final static String PAINTING = "PAINTING";
    public final static String BUYING = "BUYING";

    public final Task doTask(final String taskClass, Object... tasks) {
        switch (taskClass) {
            case DRIVING:
                return new DrivingTask("Driving", (String) tasks[0], (String) tasks[1]);
            case PAINTING:
                return new PaintingTask("Painting", (String) tasks[0], (String) tasks[1]);
            case BUYING:
                return new ShoppingTask("Buying", (String) tasks[0], (double) tasks[1]);
            default:
                return null;
        }
    }

}
