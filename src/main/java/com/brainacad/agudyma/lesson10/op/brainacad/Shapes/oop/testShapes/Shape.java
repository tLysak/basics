package com.brainacad.agudyma.lesson10.op.brainacad.shapes.oop.testShapes;

/**
 * Created by User on 18.05.2016.
 */
public class Shape {
    private double radius = 0.0;
    private String color;



    public Shape(String color){
        this.color=color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public  String toString()  {

            return  getColor();
    }

}

