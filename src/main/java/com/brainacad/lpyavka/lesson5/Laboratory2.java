package com.brainacad.lpyavka.lesson5;
import java.util.Arrays;

public class Laboratory2 {

    public static void main(String[] args) {
        int array[] = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        System.out.println("Inital array: " + Arrays.toString(array));
        int max;
        int min;
        int average;
        int median;

        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        min = array[0];
        max = array[array.length - 1];
        System.out.println("Min value of array is: " + min);
        System.out.println("Max value of array is: " + max);

        int totalValue = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            totalValue += array[i];
        }
        average = totalValue / array.length;
        System.out.println("Average value of array is: " + average);

        if (array.length % 2 == 0) {
            median = array[array.length / 2 - 1] + array[array.length / 2];
        } else {
            median = array[array.length / 2];
        }
        System.out.println("Median value of array is: " + median);
    }
}

