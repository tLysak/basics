package com.brainacad.agudyma.lesson5;

import java.util.Arrays;

/**
 * Created by User on 27.04.2016.
 */
public class massive2 {
    public static void main(String[] args) {
        int[] massive1 = new int[]{10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14};
        Arrays.sort(massive1);
        System.out.println(Arrays.toString(massive1));
        System.out.println(massive1[0]);
        int sum = 0;
        for (int element : massive1) {
            sum += element;
        }
        for (int i = 0; i < massive1.length - 1; i++) {
            sum += massive1[i];

            int medianNumber;
            if (massive1.length % 2 == 0) {
                medianNumber = massive1[massive1.length / 2 - 1] + massive1.length / 2 + 1;
            } else {
                int indexofmedian = massive1.length / 2 + 1;
                medianNumber = massive1[indexofmedian];
            }
        }

    }
}
