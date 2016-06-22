package com.brainacad.vmarch.lesson10.testshapes1;

public abstract class Shape implements Drawable {
    String shapeColor;
    String shapeName;

    Shape() {
    }

    public abstract double calcArea();

    public String toString() {
        return "This is " + shapeName + ":\n     Color: " + shapeColor;

    }


}
