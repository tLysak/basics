package com.brainacad.vmarch.massive;

public class Lesson6_01 {
    public static void main(String[] args) {

        int[] arr = new int[100];

        for (int b = 1; b <= 99; b++) {
            if (b % 2 != 0) {
                arr[b - 1] = b;
                System.out.print(arr[b - 1] + " ");
            }

        }
    }
}
