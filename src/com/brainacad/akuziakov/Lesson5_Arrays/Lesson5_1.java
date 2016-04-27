package com.brainacad.akuziakov.Lesson5_Arrays;

import java.util.Arrays;

public class Lesson5_1 {
    public static void main(String[] args) {

        int count=0;
        for (int i=1;i<=50;i++){
            if (0==i%2){
                count++;
            }
        }
        int[]oddNumbers=new int[count];
        for (int i=1, j=0;i<=50;i++){
            if (0==i%2){
                oddNumbers[j++]=i;
            }
        }
        System.out.println(Arrays.toString(oddNumbers));
    }
}
