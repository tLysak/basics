package com.brainacad.lpyavka.lesson4;

import java.util.Scanner;

/**
 * Created by Sony on 25.04.2016.
 */
public class Laboratory2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your value:");
        int value = scan.nextInt();

        if (value <= 3) {
            System.out.println("Value is lower than 3");
        } else if (value > 3 && value <= 10) {
            System.out.println("Value is from 3 to 10");
        } else {
            System.out.println("Value is bigger than 10");
        }
    }
}
