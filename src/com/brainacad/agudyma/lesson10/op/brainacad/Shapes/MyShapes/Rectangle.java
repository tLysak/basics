package com.brainacad.agudyma.lesson10.op.brainacad.Shapes.MyShapes;


/**
 * Created by Sidhartha on 21.05.2016.
 */
public class Rectangle extends Shape {
    double height;
    double width;
    String color;


    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    private double calcArea() {
        double resultArea = height * width;
        return resultArea;
    }

    @Override
    public String toString(){

        return "Shape area is: " + String.valueOf(calcArea()) ;
    }
}


