package com.brainacad.agudyma.lesson10.op.brainacad.Shapes.MyShapes;

/**
 * Created by Sidhartha on 22.05.2016.
 */
public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;
    String color;

    public Triangle(double sideA, double sideB, double sideC, String color){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }
    private String calcArea() {

        double s = (sideA+sideB+sideC)/2;
        double sum = sideA+sideB+sideC;
        double resultArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));

        return s + " " +  resultArea;
    }
    @Override
    public String toString(){
        return "Shape Area =" + calcArea();
    }


}
