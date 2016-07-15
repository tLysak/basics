package com.brainacad.vmarch.massive;

public class From2To20 {
    public static void main(String[] args) {
        int n = 20 / 2;
        int arr[] = new int[n];
        int b = 1;
        for (int a = 0; a <= n - 1; a++) {
            arr[a] = b * 2;
            b++;
            System.out.print(arr[a] + " ");
        }

    }
}

