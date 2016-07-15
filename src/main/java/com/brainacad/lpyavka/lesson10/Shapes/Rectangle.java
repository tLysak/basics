package com.brainacad.lpyavka.lesson10.Shapes;

public class Rectangle extends MyShape {
    private double width;
    private double height;


    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calcArea() {
        double rectangleArea = width * height;
        return rectangleArea;
    }

    @Override
    public String toString() {
        return "Congrats! Your rectangle has " +
                "width=" + width +
                " and height=" + height +
                ", " + super.toString();
    }
}
