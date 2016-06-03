package com.brainacad.vmarch.lesson5;


public class MatrixByLineFrom1 {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 1, 1, 3, 4, 2},
                {2, 1, 3, 1, 2, 3},
                {2, 2, 3, 4, 1, 2},
                {3, 3, 3, 1, 4, 2}
        };
        int line = 0;
        int index = 0;
        int value;

        for (value = 1; value <= 4; value++) {
            System.out.println("\n");
            System.out.println("For " + value);
            for (line = 0; line < 4; line++) {
                System.out.print("     line " + (line + 1) + ": (");
                for (index = 0; index <= 5; index++) {
                    int num = matrix[line][index];
                    if (num == value)
                        System.out.print(index + " ");


                }
                System.out.println(")");

            }


        }
    }
}
