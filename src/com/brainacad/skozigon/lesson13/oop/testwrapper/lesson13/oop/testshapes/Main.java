package com.brainacad.skozigon.lesson13.oop.testwrapper.lesson13.oop.testshapes;



/**
 * Created by skozigon on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) {


//        Shape shape1 = new Shape();
//        Shape shape2 = new Shape("red");

//        System.out.println(shape1.toString());
//        System.out.println(shape2.toString());

        Circle circle = new Circle("green", 10);
//        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle(10d, 15d);
//        System.out.println(rectangle.toString());

        Triangle triangle = new Triangle("black", 10, 12, 13);
//        System.out.println(triangle.toString());

        Shape[] arr = new Shape[]{circle, rectangle, triangle};

        double sumArea = 0;

        for (Shape i: arr
             ) {
            System.out.println(i.toString());
            sumArea+=i.calcArea();
        }
        System.out.println("total area is:" + sumArea);


    }
}
