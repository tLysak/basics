package com.brainacad.vmarch.lesson7.myinit;

import java.util.Arrays;

public class MyInit {

    int arr[] = new int[10];

    {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (100 * Math.random());
        }
    }


    public void printArray() {
        System.out.println(Arrays.toString(arr));
    }
}

