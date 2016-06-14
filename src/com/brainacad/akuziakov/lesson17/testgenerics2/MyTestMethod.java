package com.brainacad.akuziakov.lesson17.testgenerics2;

public class MyTestMethod<T extends Comparable> {

    public static <T extends Comparable> int calcNum(final T[] array, T maxelm) {
        int count = 0;
        for (T anArray : array) {
            if (anArray.compareTo(maxelm) > 0) {
                count++;
            }
        }
        return count;
    }

    public static <T extends Number&Comparable> T calcSum(final T[] array, T maxelm){
        T sum= (T) Integer.valueOf(0);
        for (T elem :array) {
            if (elem.compareTo(maxelm) > 0){
                //wsum+=
            }
        }
        return null;
    }
}
