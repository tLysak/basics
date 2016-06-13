package com.brainacad.skozigon.Labs.labs2_14.testgenerics1.testgenerics3;

import java.util.Random;

/**
 * Created by skozigon on 13.06.2016.
 */
public class MyMixer<T> {
    private T array[];

    public MyMixer(T[] array) {
        this.array = array;
    }



    public T shuffle(T[] arr){
        Random rnd = new Random();
        for (int i = 0; i <arr.length ; i++) {
            int j = rnd.nextInt(i);
            T temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return (T) arr;
    }
}
