package com.brainacad.akuziakov.lesson13.testshapes;

import static java.lang.Math.PI;

public class Circle extends Shape {

    private final double radius;

    protected double getRadius() {
        return radius;
    }

    public Circle(final String shapeColor, final double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("This is a %s, color: %s, radius=%.2f", this.getClass().getSimpleName(), getShapeColor(), getRadius());
    }
}
