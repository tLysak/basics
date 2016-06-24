package com.brainacad.vmarch.lesson10.testshapes1;


public class Circle extends Shape implements Comparable {

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
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + ".\n     Radius = " + radius + ".";
    }

    @Override
    public void draw() {
        System.out.println(toString() + "\n     Area: " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
