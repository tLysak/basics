package com.brainacad.skozigon.lesson13.oop.testwrapper.lesson13.oop.testshapes;

/**
 * Created by skozigon on 25.05.2016.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public String toString() {
        return "This is Circle, color: " + super.getShapeColor() + ", radius: " + radius + super.toString() + "\nArea is: " + calcArea() ;
    }

    @Override
    public void draw() {

    }
}
