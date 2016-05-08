package com.brainacad.lpyavka.lesson6.myMath;

public class MyMath {
     static final double PI  = 3.14;

    static int findMin(int[] array) {
        int minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    static int findMax(int[] array) {
        int maxValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    static double areaOfCircle(double radius){
        double areaOfCircle = PI* Math.pow(radius, 2);
        return areaOfCircle;
    }
}
