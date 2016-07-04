package com.brainacad.vmarch.lesson18.testgenerics2;


public class MyTestMethod {


    public static <T extends Comparable> T calcNum(T[] array, T maxel) {
        int i = 0;
        int j = 0;
        double a = 0;

        System.out.print("Array values: ");
        for (T arr : array) {
            j++;

            if (arr.compareTo(maxel) > 0) {
                i++;
                // TODO  SUM

            }

            System.out.print(arr);
            if (j < array.length) {
                System.out.print(", ");
            }
        }

        System.out.println("\n Number of elements that are greater than " + maxel + ": " + i + "\n");
        System.out.println("\n Number of elements that are greater than " + maxel + ": " + i + "\n");
        return null;
    }




    public static <T extends Comparable> T calcSum(T[] array, T maxel) {
        int i = 0;
        int j = 0;

        System.out.print("Array values: ");
        for (T arr : array) {
            j++;

            if (arr.compareTo(maxel) > 0) {
                i++;
            }

            System.out.print(arr);
            if (j < array.length) {
                System.out.print(", ");
            }
        }

        System.out.println("\n Number of elements that are greater than " + maxel + ": " + i + "\n");
        return null;

    }
}