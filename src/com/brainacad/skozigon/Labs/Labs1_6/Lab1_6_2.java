package com.brainacad.skozigon.Labs.Labs1_6;

import java.util.Arrays;

/**
 * Created by skozigon on 03.05.2016.
 */
public class Lab1_6_2 {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 1, 2 };
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));
        System.out.println("Minimum value = " + m[0] + "\nMaximum value = " + m[m.length-1]);
        System.out.println("Lenght = " + m.length);
        int sum = 0;
        for (int el: m
             ) {
            sum+=el;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/m.length);
        int med = 0;
        if (m.length%2!=0){
            med = m[m.length/2];
        }else

        med = (m[m.length/2] + m[(m.length-1)/2])/2;
        System.out.printf("Mediana = " + med);
    }

}
