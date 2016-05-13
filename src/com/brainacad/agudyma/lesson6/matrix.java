package com.brainacad.agudyma.lesson6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Sidhartha on 08.05.2016.
 */
public class matrix {
    public static void main(String args[]) {

        int[] matrix1 = new int[]{1, 1, 1, 3, 4, 2};
        int[] matrix2 = new int[]{2, 1, 3, 1, 2, 3};
        int[] matrix3 = new int[]{2, 2, 3, 4, 1, 2};
        int[] matrix4 = new int[]{3, 3, 3, 1, 4, 2};
        System.out.println(Arrays.toString(matrix1));
        System.out.println(Arrays.toString(matrix2));
        System.out.println(Arrays.toString(matrix3));
        System.out.println(Arrays.toString(matrix4));
        System.out.println("Please enter Search value");
        Scanner scanner = new Scanner(System.in);
        int searchValue = scanner.nextInt();
        int indexNumber1 = 0;
        int indexNumber2 = 1;
        int indexNumber3 = 2;
        int indexNumber4 = 3;
        int indexNumber5 = 4;
        int indexNumber6 = 5;
        System.out.print("Значення індексa в першому рядку ");
        if (matrix1[indexNumber1] == searchValue) {
            System.out.print(indexNumber1 + " ");
        }
        if (matrix1[indexNumber2] == searchValue) {
            System.out.print(indexNumber2 + " ");
        }
        if (matrix1[indexNumber3] == searchValue) {
            System.out.print(indexNumber3 + " ");
        }
        if (matrix1[indexNumber4] == searchValue) {
            System.out.print(indexNumber4 + " ");
        }
        if (matrix1[indexNumber5] == searchValue) {
            System.out.print(indexNumber5 + " ");
        }
        if (matrix1[indexNumber6] == searchValue) {
            System.out.print(indexNumber6 + "\n");
        }
        System.out.println('\n');
        System.out.print("Значення індексa в другому рядку ");
        if (matrix2[indexNumber1] == searchValue) {
            System.out.print(indexNumber1 + " ");
        }
        if (matrix2[indexNumber2] == searchValue) {
            System.out.print(indexNumber2 + " ");
        }
        if (matrix2[indexNumber3] == searchValue) {
            System.out.print(indexNumber3 + " ");
        }
        if (matrix2[indexNumber4] == searchValue) {
            System.out.print(indexNumber4 + " ");
        }
        if (matrix2[indexNumber5] == searchValue) {
            System.out.print(indexNumber5 + " ");
        }
        if (matrix2[indexNumber6] == searchValue) {
            System.out.print(indexNumber6 + "\n");
        }
        System.out.println('\n');
        System.out.print("Значення індексa в третьому рядку ");

        if (matrix3[indexNumber1] == searchValue) {
            System.out.print(indexNumber1 + " ");
        }
        if (matrix3[indexNumber2] == searchValue) {
            System.out.print(indexNumber2 + " ");
        }
        if (matrix3[indexNumber3] == searchValue) {
            System.out.print(indexNumber3 + " ");
        }
        if (matrix3[indexNumber4] == searchValue) {
            System.out.print(indexNumber4 + " ");
        }
        if (matrix3[indexNumber5] == searchValue) {
            System.out.print(indexNumber5 +  " ");
        }
        if (matrix3[indexNumber6] == searchValue) {
            System.out.print(indexNumber6 + " \n");
        }
        System.out.println('\n');
        System.out.print("Значення індексa в четвертому рядку ");
        if (matrix4[indexNumber1] == searchValue) {
            System.out.print(indexNumber1 + " ");
        }
        if (matrix4[indexNumber2] == searchValue) {
            System.out.print(indexNumber2 + " ");
        }
        if (matrix4[indexNumber3] == searchValue) {
            System.out.print(indexNumber3 + " ");
        }
        if (matrix4[indexNumber4] == searchValue) {
            System.out.print(indexNumber4 + " ");
        }
        if (matrix4[indexNumber5] == searchValue) {
            System.out.print(indexNumber5 + " ");
        }
        if (matrix4[indexNumber6] == searchValue) {
            System.out.print(indexNumber6 + "\n");
        }
    }

}


