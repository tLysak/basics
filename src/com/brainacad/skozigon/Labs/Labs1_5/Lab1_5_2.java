package com.brainacad.skozigon.Labs.Labs1_5;

import java.util.Scanner;

/**
 * Created by skozigon on 03.05.2016.
 */
public class Lab1_5_2 {
    public static void main(String[] args) {
        System.out.println("Enter X:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x>9)
            System.out.printf("X > 9");
        else {
        switch (x) {
            case 1:
                System.out.println("X = " + x);
                break;
            case 2:
                System.out.printf("X = " + x);
                break;
            case 3:
                System.out.printf("X = " + 3);
                break;
            case 4:
                System.out.printf("X = " + x);
                break;
            case 5:
                System.out.printf("X = " + x);
                break;
            case 6:
                System.out.printf("X = " + x);
                break;
            case 7:
                System.out.printf("X = " + x);
                break;
            case 8:
                System.out.printf("X = " + x);
                break;
            case 9:
                System.out.printf("X = " + x);
                break;
        }
        }
    }
}
