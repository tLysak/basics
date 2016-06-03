package com.brainacad.skozigon.lesson13.oop.testwrapper.lesson13.oop.testshapes;



/**
 * Created by skozigon on 25.05.2016.
 */
public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcSquare() {
        double squareTriangle = (a + b + c) / 2;
        return squareTriangle;
    }

    public boolean isValid() {
        if ((a <= 0) || (b <= 0) || (c <= 0)) {
            return false;
        }
        if (((a + b) > c) || ((b + c) > a) || ((a + c) > b)) {
            return true;
        }
        return false;
    }
    @Override
    public double calcArea() {
        if (isValid()) {
            double squareTriangle = calcSquare();
            double areaTriangle = Math.sqrt(squareTriangle * (squareTriangle - a) * (squareTriangle - b)
                    * (squareTriangle - c));
            return areaTriangle;
        } else {
            throw new RuntimeException("Please check if info is correct. Your triangle failed validation!");
        }
    }

    @Override
    public String toString() {
        return "This is Rectangle, color: " + super.getShapeColor() + "\nside a: " + a + "\nside b: " + b + "\nside c: " + c + "\nArea is: " + calcArea();
    }

    @Override
    public void draw() {

    }
}
