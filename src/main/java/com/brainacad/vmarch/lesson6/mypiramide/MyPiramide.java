package com.brainacad.vmarch.lesson6.mypiramide;

import java.util.Scanner;

public class MyPiramide {
    public static void main(String[] args) {

        System.out.println("Put the number: ");
        Scanner scanner = new Scanner(System.in);
        int hight = scanner.nextInt();

        int width = (hight * 2) - 1;
        int z = 0;

        for (int a = 0; a < hight; a++) {
            System.out.println();
            for (int c = 0; c < hight - (a + 1); c++)
                System.out.print(" ");

            for (int b = 0; b < width; b++) {

                if (b <= a) {
                    z = b + 1;
                    System.out.print(z);
                }

                if (b > a) {
                    z -= 1;
                    if (z > 0) {
                        System.out.print(z);
                    }
                }
            }
        }
    }
}







