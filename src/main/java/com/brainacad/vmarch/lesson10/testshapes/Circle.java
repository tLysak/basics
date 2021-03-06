package com.brainacad.vmarch.lesson10.testshapes;


public class Circle extends Shape {

    private double radius;
    private String color;

    Circle(String color, double radius) {
        super.shapeName = "Circle";
        super.shapeColor = color;
        this.radius = radius;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calcArea() {

        return Math.PI * (getRadius() * getRadius());
    }

    @Override
    public String toString() {

        return super.toString() + ". Area: " + calcArea();
    }

}
