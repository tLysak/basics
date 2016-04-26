package com.brainacad.lpyavka.lesson4;

import java.util.Scanner;

public class Laboratory2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your value:");
        int value = scan.nextInt();

        if (value <= 3) {
            System.out.println("Value is less than 3");
        } else if (value > 3 && value <= 10) {
            System.out.println("Value is bigger than 3 but less than 10");
        } else {
            System.out.println("Value is bigger than 10");
        }
    }
}
