package com.brainacad.akuziakov.lesson10.testshapes;

public class Shape {

    private final String shapeColor;

    protected String getShapeColor() {
        return shapeColor;
    }

    public Shape(final String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public double calcArea() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Shape, color is: %s", shapeColor);
    }
}
