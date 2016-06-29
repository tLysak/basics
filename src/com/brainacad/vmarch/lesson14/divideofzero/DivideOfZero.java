package com.brainacad.vmarch.lesson14.divideofzero;

import java.util.Scanner;


public class DivideOfZero {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("put 1-st number:");
        a = scanner.nextInt();
        System.out.println("put 2-nd number:");
        b = scanner.nextInt();
        try {
            System.out.println(a / b);
        } catch (Exception j) {
            System.out.println("Ups");

        }
    }
}
