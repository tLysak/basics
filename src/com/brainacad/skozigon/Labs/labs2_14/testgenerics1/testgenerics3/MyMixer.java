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



    public T[] shuffle(){
        Random rnd = new Random();
        for (int i = 0; i <array.length ; i++) {
            int j = rnd.nextInt(array.length);
            T temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return  array;
    }
}
