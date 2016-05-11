package com.brainacad.skozigon.Labs.Labs1_6;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by skozigon on 05.05.2016.
 */
public class Lab1_6_3_2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matrix size: ");
        a = sc.nextInt();
        int[][] matrix = new int[a][a];

        for (int i = 0, j = 0; i < a;  i++, j = 0) {
            matrix[i][j] = i+1;
            for (j =1; j < a; j++) {
                matrix[i][j] = (matrix[i][j-1]) + a;
            }
            System.out.println(Arrays.toString(matrix[i]));

        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
