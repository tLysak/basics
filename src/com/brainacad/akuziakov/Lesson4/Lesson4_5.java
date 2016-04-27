package com.brainacad.akuziakov.Lesson4;

import java.util.Scanner;

public class Lesson4_5 {
    public static void main(String[] args) {

        final Scanner consoleScaner = new Scanner(System.in);

        System.out.print("Please, enter your number: ");
        final int customerNumber = consoleScaner.nextInt();

        int sum = 0;

        for (int i = 1; i <= customerNumber; i++) {
            sum += i;
        }

        System.out.printf("Sum of all numbers in range 1 .. %d = %d\n", customerNumber, sum);
        System.out.printf("Average mean of all numbers in range 1 .. %d = %f\n", customerNumber, (double) sum / (double) customerNumber);
    }
}
