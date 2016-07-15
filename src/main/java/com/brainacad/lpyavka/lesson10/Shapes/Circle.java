package com.brainacad.lpyavka.lesson10.Shapes;


public class Circle extends MyShape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double calcArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public String toString() {
        return "Congrats! Your circle has " +
                "radius=" + radius +
                ", " + super.toString();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
