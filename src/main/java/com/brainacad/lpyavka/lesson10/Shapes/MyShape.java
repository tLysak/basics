package com.brainacad.lpyavka.lesson10.Shapes;

public class MyShape {
    private String color = "red";

    public MyShape() {

    }

    public MyShape(String color) {
        this.color = color;

    }

    double calcArea() {
        return 0;
    }

    @Override
    public String toString() {
        return "color of your shape " +
                "is '" + color + '\'' +
                '.';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

