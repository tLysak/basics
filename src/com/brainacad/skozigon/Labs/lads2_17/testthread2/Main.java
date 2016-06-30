//package com.brainacad.skozigon.Labs.lads2_17.testthread2;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Random;
//import java.util.Set;
//
///**
// * Created by skozigon on 23.06.2016.
// */
//public class Main {
//    public static void main(String[] args) throws InterruptedException {
//
//        int[] myArray = new int[1000];
//
//        MySumCount mySumCount1 = new MySumCount();
//        MySumCount mySumCount2 = new MySumCount();
//        Random random = new Random();
//
//        for (int i = 0 ; i < myArray.length -1; i++) {
//            myArray[i]=random.nextInt(1000);
//        }
//
//        mySumCount1.setArr(myArray);
//        mySumCount2.setArr(myArray);
//
//        mySumCount1.setStartIndex(0);
//        mySumCount1.setStopIndex(499);
//
//        mySumCount2.setStartIndex(500);
//        mySumCount2.setStopIndex(999);
//
//        Thread th1 = new Thread(mySumCount1);
//        Thread th2 = new Thread(mySumCount2);
//        long time = System.nanoTime();
//        th1.start();
//        th2.start();
//
//        th1.join();
//        th2.join();
//        long timeDone = System.nanoTime() - time;
//        System.out.println("time done = " + timeDone);
//        System.out.println(mySumCount1.getResultSum() + mySumCount2.getResultSum());
//
//        System.out.println(Arrays.toString(myArray));
//        time = System.nanoTime();
//        int sum = 0;
//        for(int element : myArray) {
//            sum += element;
//        }
//
//        System.out.println("sum = " + sum + " time " + (System.nanoTime() - time));
//
//
//    }
//}
