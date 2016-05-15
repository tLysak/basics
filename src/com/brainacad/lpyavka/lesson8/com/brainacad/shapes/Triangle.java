package com.brainacad.lpyavka.lesson8.com.brainacad.shapes;

public class Triangle {
    final private double sideOne;
    final private double sideTwo;
    final private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSquare() {
        double square = (sideOne + sideTwo + sideThree) / 2;
        return square;
    }

    public double getArea() {
        double square = getSquare();
        double area = Math.sqrt(square * (square - sideOne) * (square - sideTwo) * (square - sideThree));
        return area;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Triangle has ");
        sb.append("side one=").append(sideOne);
        sb.append(", side two=").append(sideTwo);
        sb.append(" and side three=").append(sideThree);
        sb.append('.');
        return sb.toString();
    }
}
