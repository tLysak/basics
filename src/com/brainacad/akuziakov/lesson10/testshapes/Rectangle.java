package com.brainacad.akuziakov.lesson10.testshapes;

import java.sql.ResultSet;

public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(final String shapeColor, final double width, final double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return String.format("This is %s, color: %s, width=%f, height=%f",
                this.getClass().getSimpleName(), getShapeColor(), getWidth(), getHeight());
    }
}
