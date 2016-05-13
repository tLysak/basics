package com.brainacad.lpyavka.lesson5;

import java.util.Arrays;

public class Laboratory1 {
    public static void main(String[] args) {
        int arrayLenght = 0;

        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                arrayLenght++;
            }
        }
        int[] array = new int[arrayLenght];
        int currentIndex = 0;
        for (int j = 1; j <= 30; j++) {

            if (j % 2 == 0) {
                array[currentIndex] = j;
                currentIndex++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}


