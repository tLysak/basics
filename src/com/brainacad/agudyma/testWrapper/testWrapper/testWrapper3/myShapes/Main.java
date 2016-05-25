package com.brainacad.agudyma.testWrapper.testWrapper.testWrapper3.myShapes;

import com.brainacad.agudyma.lesson11.AbstractClasses.Circle;

import java.util.Scanner;

/**
 * Created by Sidhartha on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle(1,"red");
        System.out.println("This is " + circle1);
//To do parse values
        Scanner shapeNames = new Scanner (System.in);
        Scanner scannedColor =new Scanner(System.in);
        Scanner scannedSideA =new Scanner(System.in);
        Scanner scannedSideB =new Scanner(System.in);
        Scanner scannedSideC = new Scanner(System.in);
        String color = scannedColor.nextLine();
        String shapeName =shapeNames.nextLine();
        int sideA = scannedSideA.nextInt();
        int sideB = scannedSideB.nextInt();
        int sideC = scannedSideC.nextInt();
        if (shapeName == "Circle"){
            System.out.println("This is " + circle1);
        }
        if (shapeName == "Rectangle") {
            Rectangle rectangle1 = new Rectangle(11, 20, "green");
            System.out.println("This is " + rectangle1.color + " Rectangle " + "width= " + rectangle1.width + " height= " + rectangle1.height);
            System.out.println(rectangle1.getShapeName() + " " + rectangle1.calcArea() + " " + rectangle1.getColor());
        }
        Triangle triangle1 = new Triangle(1,1,1,"blue");
        System.out.println("This is " + triangle1.color + " Triangle " + " side A "+triangle1.sideA+", side B " + triangle1.sideB+ ", side C "+ triangle1.sideC);
        System.out.println(triangle1.calcArea());
        System.out.println();
    }

}
