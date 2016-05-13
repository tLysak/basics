package com.brainacad.skozigon.Labs.Labs1_5;

import java.util.Scanner;

/**
 * Created by skozigon on 03.05.2016.
 */
public class Lab1_5_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum+= i;
        }
        System.out.println(" Number = " + n + "\n Summary = " + sum);
    }
}
