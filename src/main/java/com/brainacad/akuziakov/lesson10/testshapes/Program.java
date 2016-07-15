package com.brainacad.akuziakov.lesson10.testshapes;

public class Program {

    public static void main(String[] args) {

//        Shape shape = new Shape("RED");
//        System.out.printf("This is %s\n", shape);
//        System.out.printf("Shape area is: %.1f\n\n", shape.calcArea());

        Circle myCircle = new Circle("GREEN", 10);
        System.out.println(myCircle);
        System.out.printf("Shape area is: %.5f\n\n", myCircle.calcArea());

        Rectangle myRectangle = new Rectangle("RED", 11, 22);
        System.out.println(myRectangle);
        System.out.printf("Shape area is: %.5f\n\n", myRectangle.calcArea());

        Triangle myTriangle = new Triangle("BLACK", 5, 5, 5);
        System.out.println(myTriangle);
        System.out.printf("Shape area is: %.5f\n\n", myTriangle.calcArea());

        Shape[] arrShapes = {myRectangle, myCircle, myTriangle};
        for (Shape shape : arrShapes) {
            System.out.println(shape);
            System.out.printf("Shape area is: %.5f\n\n", shape.calcArea());
        }
    }
}
