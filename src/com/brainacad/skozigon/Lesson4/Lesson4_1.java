package com.brainacad.skozigon.Lesson4;

public class Lesson4_1{
    public static void main(String[] args) {
        for (int i = 10; i <1; i++) {
            for (int j = 0; j < i; j++) {
                if (j == 4||j == 5) {
                    System.out.print(" ");
                }else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
