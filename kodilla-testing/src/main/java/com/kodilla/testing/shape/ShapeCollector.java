package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public ShapeCollector() {

    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public boolean removeShape(Shape shape) {
        if (shapes.contains(shape)) {
            shapes.remove(shape);
            return true;
        }
        return false;
    }

    public Shape retrieveShape(int number) {
        return shapes.get(number);
    }

    public String show() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape).append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

}
