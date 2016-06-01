package com.brainacad.agudyma.testWrapper.testWrapper.testWrapper3.myShapes;


/**
 * Created by Sidhartha on 21.05.2016.
 */
public class Rectangle extends Shape {
    double height;
    double width;


    public Rectangle(int height, int width, String color) {
        this.height = getHeight();
        this.width = getWidth();
        this.color = color;
    }

    public double getHeight() {

        return height;
    }

    public double getWidth() {
        return width;
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
    @Override
    public  String getShapeName(){
        String shapeName = "Rectangle";
        return shapeName;
            }
    @Override
    public String getColor(){
        return color;
    }

}


