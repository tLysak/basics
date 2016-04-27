package com.brainacad.akuziakov.Lesson5_Arrays;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson5_3 {
    public static void main(String[] args) {

        int[][]matrix=new int[4][4];

        System.out.println(matrix.length);

        for (int i=0;i<matrix.length;i++){
            for (int j=i+1, count=0; count<4;j+=4, count++){
                System.out.printf("%4d",j);
            }
            System.out.println();
        }


        System.out.print("Enter matrix size: ");
        Scanner scanner=new Scanner(System.in);
        int maxtixSize=scanner.nextInt();
        int[][]matrix2=new int[maxtixSize][maxtixSize];

        System.out.printf("Fill in your %dx%d matrix:\n",maxtixSize,maxtixSize);
        for (int i=0;i<maxtixSize;i++){
            for (int j=0;j<maxtixSize;j++){
                matrix2[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Your matrix is:");
        for (int i=0;i<maxtixSize;i++){
            for (int j=0;j<maxtixSize;j++){
                System.out.printf("%4d",matrix2[i][j]);
            }
            System.out.println();
        }
    }
}
