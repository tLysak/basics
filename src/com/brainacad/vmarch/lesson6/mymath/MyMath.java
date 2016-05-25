package com.brainacad.vmarch.lesson6.mymath;


import java.util.Arrays;

public class MyMath {
    public MyMath() {
    }

    static int[] findMax(int array[]) {

        return array;
    }

    static int[] findMin(int array[]) {

        return array;
    }

    public static void main(String[] args) {

        int array[] = {8, 9, 4, 1, 5};

        Arrays.sort(array);
        MyMath.findMax(array);
        int maxValue = array[0];
        MyMath.findMin(array);
        int minValue = array.length - 1;
        System.out.println("Min: " + minValue + ", Max: " + maxValue);
    }
}



