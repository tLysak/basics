package com.brainacad.onesterenko.Lesson4;

import java.util.Scanner;

/**
 * Created by alexkaniv on 25.04.16.
 */
public class ScannerAndLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int a = scan.nextInt();

        if (a <3) {
            System.out.println("Your digit is less than 3");
        } else if (a >= 3 & a <= 7) {
            System.out.println("Your digit is from 3 to 7");
        } else if (a > 7 & a <= 10) {
            System.out.println("your digit is from 8 to 10");
        } else {
            System.out.println("Something went wrong");
        }
    }
}
