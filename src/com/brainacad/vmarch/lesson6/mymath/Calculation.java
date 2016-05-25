package com.brainacad.vmarch.lesson6.mymath;

import java.util.Arrays;

public class Calculation {
    public static void main(String[] args) {

        int array1[] = new int[]{2, 6, 4, 3};
        Arrays.sort(array1);

        int maxValue1 = MyMath.findMax(array1);
        int minValue1 = MyMath.findMin(array1);
        System.out.println("Min1: " + minValue1 + ", Max1: " + maxValue1);


        int array2[] = {3, 6, 4, 5, 6, 7};
        Arrays.sort(array2);

        int maxValue2 = MyMath.findMax(array2);
        int minValue2 = MyMath.findMin(array2);
        System.out.println("Min2: " + minValue2 + ", Max2: " + maxValue2);
    }
}
