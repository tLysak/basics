package com.brainacad.lpyavka.lesson5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Laboratory3 {
    public static void main(String[] args) {

        int[][] arrayRandom = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < arrayRandom.length; i++) {
            for (int j = 0; j < arrayRandom[i].length; j++) {
                arrayRandom[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Random 2D array: ");
        for (int[] arrayElement : arrayRandom) {
            System.out.println(Arrays.toString(arrayElement));
        }

        int[][] arrayScanner = new int[2][2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your value, we'll save it in 2D array: ");

        for (int i = 0; i < arrayScanner.length; i++) {

            for (int j = 0; j < arrayScanner[i].length; j++) {
                int arrayValue = scanner.nextInt();
                arrayScanner[i][j] = arrayValue;
            }
        }
        System.out.println("Scannered 2D array: ");
        for (int[] arrayElementSc : arrayScanner) {
            System.out.println(Arrays.toString(arrayElementSc));
        }
    }
}
