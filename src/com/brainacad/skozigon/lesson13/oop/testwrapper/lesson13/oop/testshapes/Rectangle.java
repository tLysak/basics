package com.brainacad.skozigon.lesson13.oop.testwrapper.lesson13.oop.testshapes;

/**
 * Created by skozigon on 25.05.2016.
 */
public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        return width*height;
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + super.getShapeColor() + "\nwidth: " + width + "\nheight: " + height+ "\nArea is: " + calcArea() ;
    }

    @Override
    public void draw() {

    }
}
