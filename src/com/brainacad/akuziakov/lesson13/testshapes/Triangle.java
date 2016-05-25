package com.brainacad.akuziakov.lesson13.testshapes;

public class Triangle extends Shape {

    private final double sideA;
    private final double sideB;
    private final double sideC;

    public double getSideC() {
        return sideC;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public Triangle(final String shapeColor, final double sideA, final double sideB, final double sideC) {
        super(shapeColor);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calcArea() {
        double halfPerimeter = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public String toString() {
        return String.format("This is %s, color: %s, a=%f, b=%f, c=%f",
                this.getClass().getSimpleName(), getShapeColor(), getSideA(), getSideB(), getSideC());
    }
}
