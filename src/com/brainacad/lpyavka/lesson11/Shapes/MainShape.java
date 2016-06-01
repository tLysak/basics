
package com.brainacad.lpyavka.lesson11.Shapes;

public class MainShape {
    public static void main(String[] args) {
        Circle circle = new Circle("red", 13);
        System.out.println(circle.toString());
        System.out.println("Circle area is " + circle.calcArea());
    }
}