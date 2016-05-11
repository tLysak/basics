package com.brainacad.tlysak.oop.lesson7;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by tymur on 5/11/16.
 */
public class MyInitTest {
    public static final int DEFAULT_I = 1;
    public static final int DEFAULT_J = 0;
    public static final int RANGE_FOR_DEFAULT_INITIALIZATION = 9999;
    private static final Random RANDOM = new Random();

    static String i;
    static int[] array;
    private static int nextId;

    String j;
    private int id;

    static {
        array = new int[RANDOM.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION)];
        for(int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION);
        }
    }

    static {
        nextId = RANDOM.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION);
        System.out.println("Initial counter of objects= " + nextId);
    }

    public MyInitTest() {
        this(DEFAULT_I, DEFAULT_J);
    }

    private void init() {

    }

    {
        this.id = nextId;
        nextId++;
        System.out.println("block");
    }

    public MyInitTest(int i, int j) {
        this.i = "" + i;
        this.j = "" + j;
    }

    public static void main(String[] args) {
        System.out.println("we are in main method");
        MyInitTest testObject = new MyInitTest();
        System.out.println(nextId);
        MyInitTest secondTestObject = new MyInitTest(12, 3);
        System.out.println(nextId);

    }


}
