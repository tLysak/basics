package com.brainacad.skozigon.Lesson4;


import java.util.Scanner;

public class Lesson4_5 {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int sum = 0, ar_mean = i;
        while (i!=0){
            sum+=i;
            i--;
        }
        System.out.println("Summary of " + ar_mean + " = " + sum);
        System.out.println("Arithmetical mean of " + ar_mean + " = " + sum/ar_mean);
    }
}
