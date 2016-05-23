//package com.brainacad.agudyma.lesson7;
//
//import com.sun.org.apache.xpath.internal.SourceTree;
//
//import java.util.Arrays;
//import java.util.Random;
//
///**
// * Created by User on 11.05.2016.
// */
//public class myInitTest {
//    static String i;
//    String j;
//    int[] array;
//
//    public static final int RANGE_FOR_DEFAULT_INITIALIZATION =9999;
//    {
//        Random random = new Random();
//        array = new int[random.nextInt(RANGE_FOR_DEFAULT_INITIALIZATION)];
//        for(int i =0; i<array.length; i++){
//            array[i] =random.nextInt();
//        }
//
//    }
//
//    static {
//        i = "12";
//        System.out.println("fisrt static block");
//    }
//
//    {
//        System.out.println("instatic");
//    }
//    public MyInitTest () {
//        this(1,0);
//    }
//
//    {
//        System.out.println("instance block 2");
//    }
//    public MyInitTest (int i, int j) {
//        this.i = "" +1;
//        this.j = "" +1;
//    }
//    static {
//        System.out.println("");
//    }
//
//    public static void main(String[] args) {
//        System.out.println("we are in the main method");
//        MyInitTest testObject = new MyInitTest();
//        MyInitTest secondTestObject = new MyInitTest();
//        System.out.println("Fisrt array" + Arrays.toString(testObject.array));
//        System.out.println("Second array"+ Arrays.toString(secondTestObject.array));
//
//
//    }
//}
