package com.brainacad.akuziakov.Lesson5_Arrays;

import java.util.Arrays;

public class Lesson5_1 {
    public static void main(String[] args) {

        int startValue = 1, endValue = 50, arrayLength = endValue / 2;

        int[] oddNumbers = new int[arrayLength];

        for (int i = startValue, currentIndex = 0; i <= endValue; i++) {
            if (0 == i % 2) {
                oddNumbers[currentIndex++] = i;
            }
        }

        System.out.print(Arrays.toString(oddNumbers));

        System.out.print("\n ");

        for (int element :
                oddNumbers) {
            System.out.print(element+", ");
        }
    }
}
