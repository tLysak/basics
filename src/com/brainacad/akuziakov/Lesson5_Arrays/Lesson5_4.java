package com.brainacad.akuziakov.Lesson5_Arrays;

import sun.security.mscapi.KeyStore;

import java.util.Arrays;

public class Lesson5_4 {
    public static void main(String[] args) {

        final int[]  arrayForBinarySearch = {3, 2, 14, 6, 11, 32, 1, 4};

        final int searchValue=11;

        Arrays.sort(arrayForBinarySearch);

        while (true){
            int middle=arrayForBinarySearch.length/2;
            if(arrayForBinarySearch[middle]>searchValue){

            }
        }
    }

    private static int MyBinarySearch(int[] arr, int seachVal){
        int middle=arr.length/2;
        if (arr[middle]==seachVal){
            return middle;
        }else if(arr[middle]<seachVal){
            int[] newArr=Arrays.copyOf(arr,)// TODO: 4/27/2016 Проработать методы копирования массивов. Необходимо передать копию второй половины массива arr
            return MyBinarySearch(Arrays.copyOf())
        }
    }
}
