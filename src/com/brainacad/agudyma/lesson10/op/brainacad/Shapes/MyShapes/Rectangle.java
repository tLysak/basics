package com.brainacad.agudyma.lesson10.op.brainacad.Shapes.MyShapes;


/**
 * Created by Sidhartha on 21.05.2016.
 */
public class Rectangle extends Shape {
    double height;
    double width;


    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public double calcArea() {
        double resultArea = height * width;
        return resultArea;
    }

    @Override
    public String toString(){

        return "Shape Area = : " + String.valueOf(calcArea()) ;
    }
}


