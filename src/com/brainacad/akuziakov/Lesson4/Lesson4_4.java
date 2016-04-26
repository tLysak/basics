package com.brainacad.akuziakov.Lesson4;

public class Lesson4_4 {
    public static void main(String[] args) {

        for (int i = 1, count = 0; i <= 300 && count < 10; i++) {
            if (0 == i % 3 && 0 == i % 4) {
                System.out.printf("%2d number is: %d.\n", ++count, i);
            }

        }
    }
}
