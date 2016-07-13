package com.brainacad.skozigon.Lesson7;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by skozigon on 11.05.2016.
 */
public class MyInitTest {
    public static final int RANGE_FOR_DEFAULT_INITIALISATION = 9999;


    static String i;
    String j;
    int[] array;

    private static Random random = new Random();

    {
        Random random = new Random();
        array = new int[random.nextInt(RANGE_FOR_DEFAULT_INITIALISATION)];
        for (int i = 0; i <array.length ; i++) {
            array[i] = random.nextInt(RANGE_FOR_DEFAULT_INITIALISATION);
        }

    }
    static {
        System.out.println("Static block 1");
    }

    static {
        i = "12";
        System.out.println("Static block 2");
    }

    public MyInitTest(){

    }

    public MyInitTest(int i, int j){
        this.i = ""+i;
        this.j = ""+j;
    }

    public static void main(String[] args) {
        System.out.println("MainWrapper1 metod");
        MyInitTest firstObject = new MyInitTest();
        MyInitTest secondObject = new MyInitTest(10,12);
        System.out.println(Arrays.toString(firstObject.array));
        System.out.println(Arrays.toString(secondObject.array));
    }
}
