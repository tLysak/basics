package com.brainacad.skozigon.Lesson6.Home;

import java.util.Arrays;
import java.util.Scanner;

class MyMath{

    final static double PI = 3.14;

    static int findMin(int[] mass){
        Arrays.sort(mass);
        return mass[0];
    }
    static int findMax(int[] mass){
        Arrays.sort(mass);
        return mass[mass.length - 1];
    }

    static float areaOfCircle(float r){
        return (float) (PI*(r*r));
    }


}
public class Calculation {

    static void printMass(int[] mass){
        System.out.println("Max element in array is: " + MyMath.findMax(mass));
        System.out.println("Min element in array is: " + MyMath.findMin(mass));
    }
    public static void main(String[] args) {


        int[] mass1 = new int[]{1,52,34,69,54, -25, 127};
        int[] mass2 = new int[]{26, 58, -45, 87,36};

        System.out.println("First array: " + Arrays.toString(mass1));
        printMass(mass1);
        System.out.println("\n");
        System.out.println("Second array: " + Arrays.toString(mass2));
        printMass(mass2);

        System.out.println("\nEnter radius: ");
        Scanner sc = new Scanner(System.in);
        float rad;
        rad= sc.nextFloat();


        System.out.println("Area of circle = " + MyMath.areaOfCircle((float) rad));
    }
}
