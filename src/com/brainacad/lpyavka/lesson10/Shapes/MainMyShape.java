package com.brainacad.lpyavka.lesson10.Shapes;

public class MainMyShape {
    public static void main(String[] args) {

        MyShape myShape = new MyShape();
        Circle circle = new Circle(myShape.getColor(), 10);
        Rectangle rectangle = new Rectangle(myShape.getColor(), 11, 22);
        Triangle triangle = new Triangle();

        System.out.println(circle.toString());
        System.out.println("Circle got area " + circle.calcArea());
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println(rectangle.toString());
        System.out.println("Rectangle got area " + rectangle.calcArea());
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-");
        System.out.println(triangle.toString());
        System.out.println("Triangle got area " + triangle.calcArea());
    }
}
