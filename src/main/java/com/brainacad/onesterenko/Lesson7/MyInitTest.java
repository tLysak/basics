package com.brainacad.onesterenko.Lesson7;

import java.*;


/**
 * Created by User on 11.05.2016.

public class MyInitTest {
    public static final int DEFAULT_I =1;
    public static final int DEFAULT_J =0;
    public static final int RANGE_FOR_DEFAULT_INITIALIZATION =999;
    public static final Random RANDOM = new Random();
    static String i;
    String j;
    int [] array;
    static int nextId = RANDOM.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION);
    private int id;

    {
        Random random = new Random();
        array = new int [random.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION)];
        for (int i =0; i<array.length;  i++){
            array[i]= random.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION);
        }
    }
    static {
        i = "12";
        System.out.println("first block");
    }
    public MyInitTest()   {
       this (DEFAULT_I, DEFAULT_J);

    }

    public static void main(String[] args) {
        MyInitTest testObject = new MyInitTest();
        MyInitTest secondTestObject = new MyInitTest(12,3);
        System.out.println(Arrays.toString(testObject));
    }
}
 */
