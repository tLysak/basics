package com.brainacad.vmarch.massive;

public class SortedMassiveByCircle {
    public static void main(String[] args) {
        int[] mass = {3, 8, 6, 9, 12, 23, 2};
        int a;
        int temp;

        System.out.println("Unsorted Massive:");
        for (a = 0; a < mass.length; a++) {
            System.out.print(mass[a] + " ");
        }
        for (a = 1; a < mass.length; a++) {
            for (int min = 0; min < mass.length - 1; min++)
                if (mass[min] > mass[min + 1]) {
                    temp = mass[min + 1];
                    mass[min + 1] = mass[min];
                    mass[min] = temp;
                }
        }
        System.out.println("\n\nSorted Massive:");
        for (a = 0; a < mass.length; a++) {
            System.out.print(mass[a] + " ");
        }
    }
}
