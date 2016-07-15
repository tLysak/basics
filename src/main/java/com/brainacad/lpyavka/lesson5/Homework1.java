package com.brainacad.lpyavka.lesson5;

//1 1 1 3 4 2
//2 1 3 1 2 3
//2 2 3 4 1 2
//3 3 3 1 4 2
//Для кожної цифри, яка присутня в цій матриці знайти  області, де ці цифри повторюються
//Наприклад, для цифри "1" програма має вивести в консоль:
//Line 1: [0-2]
//Line 2: [1,3]
//Line 3: [4]
//Line 4: [3]
public class Homework1 {

    public static void main(String[] args) {

        int[][] array = {{1, 1, 1, 3, 4, 2},
                {2, 1, 3, 1, 2, 3},
                {2, 2, 3, 4, 1, 2},
                {3, 3, 3, 1, 4, 2}};

        int valueOne = 1;
        System.out.println("Value 1 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print("- line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == valueOne) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }

        int valueTwo = 2;
        System.out.println("Value 2 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print("- line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == valueTwo) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }

        int valueThree = 3;
        System.out.println("Value 3 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print("- line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == valueThree) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }

        int valueFour = 4;
        System.out.println("Value 4 is used in :");
        for (int i = 0; i < array.length; i++) {
            System.out.print("- line " + (i + 1) + ", row ");
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == valueFour) {
                    System.out.print(j + ", ");
                }
            }
            System.out.println();
        }

    }
}
