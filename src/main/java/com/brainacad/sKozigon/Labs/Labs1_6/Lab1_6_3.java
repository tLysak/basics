package com.brainacad.skozigon.Labs.Labs1_6;

import java.util.Scanner;

/**
 * Created by skozigon on 05.05.2016.
 */
public class Lab1_6_3 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        a = sc.nextInt();
        int i=1, k = 1;
        do {
            System.out.print(i + "\t");
            k = i;
            for (int j = 1; j < a; j++ ) {
                System.out.print((k+=a) + "\t");
            }
            System.out.printf("\n");
            i++;
        }while (i!=a+1);
    }
}
