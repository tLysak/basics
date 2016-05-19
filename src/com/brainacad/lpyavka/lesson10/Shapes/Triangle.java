package com.brainacad.lpyavka.lesson10.Shapes;

public class Triangle extends MyShape {
    private double sideA = 5;
    private double sideB = 5;
    private double sideC = 5;

    public Triangle() {
        super("black");

    }

    public double calcSquare() {
        double squareTriangle = (sideA + sideB + sideC) / 2;
        return squareTriangle;
    }

    public boolean isValid() {
        if ((sideA <= 0) || (sideB <= 0) || (sideC <= 0)) {
            return false;
        }
        if (((sideA + sideB) > sideC) || ((sideB + sideC) > sideA) || ((sideA + sideC) > sideB)) {
            return true;
        }
        return false;
    }

    @Override
    public double calcArea() {
        if (isValid()) {
            double squareTriangle = calcSquare();
            double areaTriangle = Math.sqrt(squareTriangle * (squareTriangle - sideA) * (squareTriangle - sideB)
                    * (squareTriangle - sideC));
            return areaTriangle;
        } else {
            throw new RuntimeException("Please check if info is correct. Your triangle failed validation!");
        }
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Congrats! Your triangle has ");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(" and sideC=").append(sideC);
        sb.append(", color of your shape is'").append(getColor()).append('\'');
        sb.append('.');
        return sb.toString();
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

}
