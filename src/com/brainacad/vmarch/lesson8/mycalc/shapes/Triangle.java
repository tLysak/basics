package com.brainacad.vmarch.lesson8.mycalc.shapes;

public class Triangle {

    private double a = 1.0;
    private double b = 1.0;
    private double c = 1.0;


    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }


    public double getArea() {
        double s = (a + b + c) * 0.5;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));

    }

    public void printResult() {
        System.out.println("Area of Triangle with sides: a = " + a + ", b = " + b + ", c = " + c + " is: " + getArea());

    }

}
