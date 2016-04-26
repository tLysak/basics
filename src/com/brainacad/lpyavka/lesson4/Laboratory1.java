package com.brainacad.lpyavka.lesson4;

public class Laboratory1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            for (int j = i; j >= 1; j--) {
                if (i == 6 && j == 4 || i == 7 && j == 5) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
