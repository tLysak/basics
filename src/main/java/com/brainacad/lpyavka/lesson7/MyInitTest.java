package com.brainacad.lpyavka.lesson7;

import java.util.Random;

public class MyInitTest {
    public  static final int DEFAULT_1 = 1;
    public  static final int DEFAULT_2 = 0;
    public static final int RANGE_FOR_DEFAULT_INITIALIZATION = 9999;
    static String i;
    String j;
    int[]array;
    {
        Random random = new Random();
        array = new int[random.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION)];
        for (int i = 0; i<array.length;i++){
            array[i] = random.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION);
        }
    }

    static {
        i = "12";
        System.out.println("We are in the static block 1");
    }

    {
        System.out.println("We are in the instance block 1");
    }

    public MyInitTest() {
        this(DEFAULT_1, DEFAULT_2);
    }

    {
        System.out.println("We are in the instance block 2");
    }

    public MyInitTest(int i, int j) {
        this.i = ""+ i;
        this.j = ""+ j;

    }

    static {
        System.out.println("We are in the static block 2");
    }

    public static void main(String[] args) {
        System.out.println("We are in main method");
        MyInitTest testObject = new MyInitTest();
        MyInitTest secondTestObject = new MyInitTest(12, 3);
    }

}
