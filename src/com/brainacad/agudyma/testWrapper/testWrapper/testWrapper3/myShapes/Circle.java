package com.brainacad.agudyma.testWrapper.testWrapper.testWrapper3.myShapes;

import static java.lang.Math.PI;

/**
 * Created by Sidhartha on 19.05.2016.
 */
public class Circle extends Shape {

    private double radius = 0.0;
    private String shapeName;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;

    }
//    @Override
//    public String getShapeName(){
//
//        return super.getShapeName();
//    }
    @Override
    public String toString() {

        return ": " + getColor()+", radius ="+ getRadius() + " "+"Shape area = " + String.valueOf(calcArea());
    }


    public double calcArea(){
        double resultArea = PI *Math.pow(radius,2);
        return resultArea;
    }
    public String setColor(String color) {
        this.color = color;
        return color;
    }
    public double getRadius() {

        return radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public void setRadius(double radius) {

        this.radius = radius;
    }

    public String getColor() {
        return color;

    }
}
