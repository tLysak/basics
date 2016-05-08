package com.brainacad.lpyavka.lesson5;

import java.util.Arrays;

/**
 * Created by User on 27.04.2016.
 */
public class massive {
    public static void main(String[]arg){
        int startV = 1;
        int endV = 50;
        int arrLenghth = endV/2;
        int[] result = new int[arrLenghth];
        for (int i  =1, currentID = 0 ; i<= endV; i++){
            if(i%2 == 0) {
                result[currentID] =i;
                currentID++;

            }

        }
        System.out.println(Arrays.toString(result));}
}

