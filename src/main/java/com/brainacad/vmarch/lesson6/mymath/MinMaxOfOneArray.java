package com.brainacad.vmarch.lesson6.mymath;

import java.util.Arrays;


public class MinMaxOfOneArray {

    public static void main(String[] args) {

        int array[] = {8, 9, 4, 1, 5};

        Arrays.sort(array);
        int maxValue = MyMath.findMax(array);
        int minValue = MyMath.findMin(array);
        System.out.println("Min: " + minValue + ", Max: " + maxValue);


    }
}
