package com.brainacad.skozigon.Labs.Labs1_5;

/**
 * Created by skozigon on 03.05.2016.
 */
public class Lab1_5_4 {
    public static void main(String[] args) {
        int k = 1;
        for (int j = 1; j <= 300 & k <= 10; j++) {
            if (j % 3 == 0 & j % 4 == 0) {
                System.out.println(k + "     " + j);
                k++;
            }
        }

    }
}

