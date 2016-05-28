package com.brainacad.agudyma.testWrapper.testWrapper.testWrapper3.myShapes;



import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

import static java.lang.String.*;

/**
 * Created by Sidhartha on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {

//To do parse values
                System.out.println("Enter shape name");
        Scanner shapeNames = new Scanner (System.in);
        String shapeName =shapeNames.nextLine();
                System.out.println("Enter shape color");
        Scanner scannedColor =new Scanner(System.in);
        String color = scannedColor.nextLine();

        switch (shapeName){
            case  "c":
                System.out.println("Enter radius");
                Scanner scannedRadius =new Scanner(System.in);
                int radius = scannedRadius.nextInt();
                Circle circle1 = new Circle(radius,color);
                System.out.println("This is " +" Circle " + circle1);

            break;

            case "r":
                System.out.println("Enter sideA");
                Scanner scannedSide1 =new Scanner(System.in);
                int side1 = scannedSide1.nextInt();
                System.out.println("Enter sideB");
                Scanner scannedSide2 =new Scanner(System.in);
                int side2 = scannedSide2.nextInt();
                Rectangle rectangle1 = new Rectangle(side1, side2, color);
                System.out.println("This is " + rectangle1.color + " Rectangle " + "width= " + rectangle1.width + " height= " + rectangle1.height);
                System.out.println(rectangle1.getShapeName() + " " + rectangle1.calcArea() + " " + rectangle1.getColor());
            break;

            case "t":

                System.out.println("Enter sideA");
                Scanner scannedSideA =new Scanner(System.in);
                int sideA = scannedSideA.nextInt();
                Scanner scannedSideB =new Scanner(System.in);
                System.out.println("Enter sideB");
                int sideB = scannedSideB.nextInt();
                System.out.println("Enter sideC");
                Scanner scannedSideC = new Scanner(System.in);
                int sideC = scannedSideC.nextInt();
                Triangle triangle1 = new Triangle(sideA, sideB, sideC, color);
                System.out.println("This is " + triangle1.color + " Triangle " + " side A " + triangle1.sideA + ", side B " + triangle1.sideB + ", side C " + triangle1.sideC);
                System.out.println("Triangle area =" +triangle1.calcArea());
            break;

    }

}}
