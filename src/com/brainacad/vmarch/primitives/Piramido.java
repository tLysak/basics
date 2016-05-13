package com.brainacad.vmarch.primitives;

public class Piramido {
    public static void main(String[] args) {
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= a; b++) {
                if (a < 6 | a > 8) {
                    System.out.print(b + " ");
                } else {
                    if ((a >= 6 | a <= 8 && b == 5 | b == 2) || (a == 6 | a == 8 && b == 3 | b == 4)) {
                        System.out.print("  ");
                    } else {
                        System.out.print(b + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
