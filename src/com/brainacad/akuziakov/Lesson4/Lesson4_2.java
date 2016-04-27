package com.brainacad.akuziakov.Lesson4;

//read from console x
//if x<3 - вивести

import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {

        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        x = scanner.nextInt();

        if (x < 3) {
            System.out.printf("x=%d and is less then 3", x);
        } else if (x >= 10) {
            System.out.printf("x=%d and is greater then or equal to 10", x);
        } else {
            System.out.printf("x=%d and is greater then or equal to 3 and less then 10", x);
        }
    }
}
