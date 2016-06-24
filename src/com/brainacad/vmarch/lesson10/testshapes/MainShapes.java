package com.brainacad.vmarch.lesson10.testshapes;


public class MainShapes {
    public static void main(String[] args) {


        Circle circle = new Circle("RED", 20.0);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle("GREEN", 10.0, 12.0);
        System.out.println(rectangle);

        Threeangle threeangle = new Threeangle("BLACK", 11.3, 13.4, 15.8);
        System.out.println(threeangle);
    }
}
