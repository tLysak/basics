package com.brainacad.onesterenko.lesson10.shapes;

/**
 * Then add to class Main code to create one Circle object and print it name color, and radius to console.
 Then invoke calcArea() method and print result to console.
 Main output must looks like:
 “This is Circle, color: GREEN, radius=10”
 “Shape area is: 314.15926”
 Then add to class Main code to create one Rectangle object and print it name, color, width and height to console.
 Then invoke calcArea() method and print result to console.
 Main output must looks like:
 “This is Rectangle, color: RED, width=11, height=22”
 “Shape area is: 242”
 */
public class Main {
    public static void main(String[] args) {

    Circle circle = new Circle();
        Triangle triangle = new Triangle("red",2,9,5);
        System.out.println(circle.toString());

        System.out.println(triangle.toString());
        System.out.println(triangle.s);

    }

}
