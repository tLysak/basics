package com.brainacad.vmarch.Lesson4;

import java.util.Scanner;

public class Lesson4_5 {
    public static void main(String[] args) {
        System.out.println("Enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int scan = scanner.nextInt();
        System.out.println();
        System.out.println("You enter the: " + scan);
        int a;
        int b = 0;
        int d = 0;
        for (a = 1; 0 <= (scan - a); a++) {
            b += a;
            d++;
        }
        System.out.println();
        System.out.println("Sum of the numbers in the range of 1 .. " + scan + " is: " + b);
        System.out.println("The average value of the numbers in the range of 1 .. " + scan + " is: " + (b / d));
    }
}
