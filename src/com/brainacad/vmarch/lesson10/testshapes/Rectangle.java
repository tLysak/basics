package com.brainacad.vmarch.lesson10.testshapes;


public class Rectangle extends Shape {

    private String color;
    private double sideA;
    private double sideB;

    Rectangle(String color, double sideA, double sideB) {
        super.shapeName = "Rectangle";
        super.shapeColor = color;
        this.sideA = sideA;
        this.sideB = sideB;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return super.toString() + ". Area: " + calcArea();
    }


}
