package com.brainacad.skozigon.Labs.Labs1_6;


import java.util.Scanner;

/**
 * Created by skozigon on 05.05.2016.
 */
public class Lab1_6_4 {
    public static void main(String[] args) {

        System.out.println("Enter searching number: ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[][] mass =  {{1,1,1,3,4},{2,1,3,1,2},{2,2,3,4,1},{3,3,3,1,4}};
        for (int i = 0; i < mass.length; i++) {
            System.out.print("Line " + i);
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j]== k){
                    System.out.print(" ["+i+"]["+j+"]");
                }
            }
            System.out.println();
        }

    }
}
