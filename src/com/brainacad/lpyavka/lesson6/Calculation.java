package com.brainacad.lpyavka.lesson6;

import java.util.Arrays;

public class Calculation {
    public static void main(String[] args) {
        int[] arrayFirst = new int[]{2, 5, 9, 0, 12, 190, -1};
        int[] arraySecond = new int[]{20, 1, 98, 4, 3, 1, 54};
        System.out.println(Arrays.toString(arrayFirst));
        System.out.println("Min value is: " + MyMath.findMin(arrayFirst));
        System.out.println("Max value is: " + MyMath.findMax(arrayFirst));
        System.out.println();
        System.out.println(Arrays.toString(arraySecond));
        System.out.println("Min value is: " + MyMath.findMin(arraySecond));
        System.out.println("Max value is: " + MyMath.findMax(arraySecond));
        System.out.println();

        double radius = 14;
        System.out.println("When radius is "+ radius + ", area of circle is "+ MyMath.areaOfCircle(radius));
    }
}
