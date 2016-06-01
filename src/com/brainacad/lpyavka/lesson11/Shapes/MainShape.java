package com.brainacad.lpyavka.lesson11.Shapes;

import com.brainacad.onesterenko.lesson11.Triangle;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 13);
        Triangle triangle = new Triangle();
        circle.calcArea();
        triangle.calcArea();
        System.out.println(circle.toString());
        System.out.println(triangle.toString());
    }
}
