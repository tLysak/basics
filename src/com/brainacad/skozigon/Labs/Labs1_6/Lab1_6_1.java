package com.brainacad.skozigon.Labs.Labs1_6;

import java.util.Arrays;

/**
 * Created by skozigon on 03.05.2016.
 */
public class Lab1_6_1 {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 1, j = 0; i <= 60 & j < 15; i++) {
            if (i % 2 == 0) {
                arr[j] = i;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
        for (int el:arr
             ) {
            System.out.println(el);

        }

    }
}
