package com.brainacad.vmarch.lesson10.testshapes1;

import java.util.Arrays;

public class MainShapes {

    private static Circle circle = new Circle("RED", 20.0);
    private static Rectangle rectangle = new Rectangle("GREEN", 10.0, 12.0);
    private static Rectangle rectangle2 = new Rectangle("ORANGE", 21.9, 8.1);
    private static Threeangle threeangle = new Threeangle("BLACK", 11.3, 13.4, 15.8);

    public static void main(String[] args) {

        Shape[] arrayOfShapes = {circle, rectangle, rectangle2, threeangle};

        for (Shape arr : arrayOfShapes) {
            arr.draw();
        }

        Rectangle[] arr2 = {
                rectangle,
                rectangle2,
                new Rectangle("WHITE", 11.1, 12.2),
                new Rectangle("BLUE", 13.1, 1.5),
                new Rectangle("GREY", 14.1, 15.2),
                new Rectangle("PINK", 11.6, 9.0)};

        Arrays.sort(arr2);
        int j;
        System.out.println("\nIt is ARRAY of Rectangles: \n");
        for (j = 0; j < arr2.length; j++) {
            arr2[j].draw();
        }


//        Object a = o.rectangle;
//        if(rectangle.calcArea().compareTo(rectangle2.calcArea())<0){
//            System.out.println("");
//        }
    }
}
