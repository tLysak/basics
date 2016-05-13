package com.brainacad.akuziakov.Lesson8_Jars.com.brainacad.shapes;

public class Triangle {
    final private double sideOne;
    final private double sideTwo;
    final private double sideThree;

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public Triangle(final double sideOne, final double sideTwo, final double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSquare() {
        double perimeter = sideOne + sideTwo + sideThree;
        double halfPerimeter=perimeter/2;

        return Math.sqrt(halfPerimeter*(halfPerimeter-sideOne)*(halfPerimeter-sideTwo)*(halfPerimeter-sideThree));
    }
}
