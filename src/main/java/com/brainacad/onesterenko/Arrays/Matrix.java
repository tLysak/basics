package com.brainacad.onesterenko.Arrays;

/**
 * 1. Оголосити і ініціалізувати матрицю:
 1 1 1 3 4 2
 2 1 3 1 2 3
 2 2 3 4 1 2
 3 3 3 1 4 2
 Для кожної цифри, яка присутня в цій матриці знайти  області, де ці цифри повторюються
 Наприклад, для цифри "1" програма має вивести в консоль:
 Line 1: [0-2]
 Line 2: [1,3]
 Line 3: [4]
 Line 4: [3].
 */
public class Matrix {
    public static void main(String[] args) {
        int array [] []  = {{1,1,1,3,4,2},{2,1,3,1,2,3}, {2,2,3,4,1,2}, {3,3,3,1,4,2}};

        int One = 1;
        System.out.println("Value 1 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == One) {
                    System.out.print(j+1 + ", ");
                }
            }
            System.out.println();
        }

        int Two = 2;
        System.out.println(" 2 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == Two) {
                    System.out.print(j+1 + ", ");
                }
            }
            System.out.println();
        }

        int Three = 3;
        System.out.println("3 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == Three) {
                    System.out.print(j+1 + ", ");
                }
            }
            System.out.println();
        }

        int Four = 4;
        System.out.println("4 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == Four) {
                    System.out.print(j+1 + ", ");
                }
            }
            System.out.println();
        }

    }
    }
