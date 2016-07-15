package com.brainacad.agudyma.lesson5;

import java.util.Arrays;

/**
 * Created by User on 27.04.2016.
 */
public class massive3 {
    public static void main(String[] args) {
        int[] doubledimensionArray[];
        doubledimensionArray = new int[][]{{1, 5, 9, 13},
                {2, 7, 11, 15},
                {3, 7, 11, 15},
                {4, 8, 12, 16}};
        for (int[] element : doubledimensionArray) {
            System.out.println(Arrays.toString(element));
        }
        int[] Array2 = {3, 2, 14, 12, 16, 11, 32};
        final int Search = 11;
        Arrays.sort(Array2);
        System.out.println(Arrays.toString(Array2));
        while (true) {
            int middle = Array2.length / 2;
            {
                if (Array2[middle] > Search) {
                }


            }


        }
    }
}
