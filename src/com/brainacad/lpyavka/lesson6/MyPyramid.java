package com.brainacad.lpyavka.lesson6;

public class MyPyramid {

    static void printPyramid(int high) {
        for (int i = 1; i <= high; i++) {
            for (int j = 1; j <= high - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print(k);
            }
            for (int t = i; t >= 1; t--) {
                System.out.print(t);
            }
            System.out.println();
        }
    }
}
