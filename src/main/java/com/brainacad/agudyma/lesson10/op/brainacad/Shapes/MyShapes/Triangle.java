package com.brainacad.agudyma.lesson10.op.brainacad.Shapes.MyShapes;

import com.brainacad.agudyma.lesson10.op.brainacad.shapes.myShapes.Shape;

import static java.lang.Math.*;

/**
 * Created by Sidhartha on 22.05.2016.
 */
public class Triangle extends Shape {
    double sideA;
    double sideB;
    double sideC;


    public Triangle(double sideA, double sideB, double sideC, String color){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.color = color;
    }
    @Override
    public double calcArea() {

        double s = (getSideA() + getSideB() + getSideC()) / 2;

        return sqrt(s*(s-getSideA())*(s-getSideB())*(s-getSideC()));
    }

//    @Override
//    public String toString(){
//        return "Shape Area =" + String.valueOf(calcArea());


    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
                return sideB;
    }

    public double getSideC() {
        return sideC;
    }
}
