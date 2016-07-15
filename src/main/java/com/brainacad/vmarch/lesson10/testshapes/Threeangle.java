package com.brainacad.vmarch.lesson10.testshapes;


public class Threeangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;
    private String color;

    public Threeangle(String color, double sideA, double sideB, double sideC) {
        super.shapeName = "Threeangle";
        super.shapeColor = color;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;


    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double s = (getSideA() + getSideB() + getSideC()) * 0.5;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    @Override
    public String toString() {

        return super.toString() + ". Area: " + calcArea();
    }
}
