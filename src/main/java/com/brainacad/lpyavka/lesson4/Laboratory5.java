package com.brainacad.lpyavka.lesson4;

import java.util.Scanner;

public class Laboratory5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter upper bound!");
        int upperBound = scanner.nextInt();
        int sum = 0;
        double average;
        for (int i = 1; i <= upperBound; i++) {
            sum += i;
        }
        average = sum / upperBound;
        System.out.println("Sum from 1 to " + upperBound + " is " + sum);
        System.out.println("Average num from 1 to " + upperBound + " is " + average);
    }
}

