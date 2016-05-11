package com.brainacad.skozigon.Lesson6.Home;

import java.util.Scanner;

class MyPiramide {
    static void printPiramide(int h) {
        String s = "";
        String c = "";
        for (int i = 1; i <= h; i++) {
            s = s + i;
            for (int j = 1; j <= h - i; j++) {
                System.out.printf(" ");
            }
            System.out.print(s + c);
            System.out.println();
            c = i + c;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter piramide high: ");
        Scanner sc = new Scanner(System.in);

        MyPiramide.printPiramide(sc.nextInt());
    }

}

