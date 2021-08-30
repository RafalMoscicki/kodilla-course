package com.kodilla.patterns.factory;

public final class ShapeFactory {

    public final static String CIRCLE = "CIRCLE";
    public final static String SQUARE = "SQUARE";
    public final static String RECTANGLE = "RECTANGLE";

    public final Shape makeShape(final String shapeClass, double... dimensions) {
        switch (shapeClass) {
            case CIRCLE:
                return new Circle("The rounded circle", dimensions[0]);
            case SQUARE:
                return new Square("The angular square", dimensions[0]);
            case RECTANGLE:
                return new Rectangle("The long rectangle", dimensions[0], dimensions[1]);
            default:
                return null;
        }
    }
}
