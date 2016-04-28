package com.brainacad.vmarch.Lesson4;

public class Lesson4_3 {
    public static void main(String[] args) {
        int a;
        System.out.print("* | ");
        for (a = 1; a < 10; ++a) {
            System.out.print(a + "  ");
        }
        System.out.println();
        System.out.print("------------------------------");

        for (a = 1; a < 10; ++a) {
            System.out.println();
            System.out.print(a + " | ");

            for (int b = 1; b < 10; ++b) {
                int c = a * b;
                if (c <= 9) {
                    System.out.print(c + "  ");
                } else {
                    System.out.print(c + " ");
                }
            }
        }
    }
}
