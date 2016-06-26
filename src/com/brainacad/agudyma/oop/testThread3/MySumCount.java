package com.brainacad.agudyma.oop.testThread3;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Sidhartha on 24.06.2016.
 */
public class MySumCount extends Thread {

    private static int sum;
    public int startIndex;
    public int stopIndex;
    public  int [] arrOfInt;
    public long resultSum;

    public long getResultSum() {
        return resultSum;
    }


    public int[] getArrOfInt() {
        return arrOfInt;
    }

    public void setArrOfInt(int[] arrOfInt) {
        this.arrOfInt = arrOfInt;
    }


    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {

        this.stopIndex = stopIndex;
    }

    @Override
    public void run() {
        int f  = getStartIndex();

        for ( getStartIndex() ; getStartIndex()< stopIndex;f++)
            resultSum += arrOfInt[f];

//        while (getStartIndex() < getStopIndex()) {
//            {
//                resultSum += getArrOfInt()[startIndex++];
//
//            }
//    System.out.println("sum " + getResultSum());

    }


//    public long sumOfArrayElements() {
//
//                while (getStartIndex() < getStopIndex()) {
//            {
//                resultSum += getArrOfInt()[startIndex++];
//            }
//        }
//        return resultSum;
//    }

    public static void main(String[] args) throws InterruptedException {

        int[] arrOfInt = new int[100];
        Random random = new Random(99);
        for (int i = 0; i < arrOfInt.length; i++) {
            arrOfInt[i] = random.nextInt(99);
                }
        MySumCount mySumCount = new MySumCount();

        mySumCount.setStartIndex(0);
        System.out.println(mySumCount.getStartIndex());

        mySumCount.setStopIndex(5);
        System.out.println(mySumCount.getStopIndex());

        mySumCount.setArrOfInt(arrOfInt);
        System.out.println(Arrays.toString(mySumCount.getArrOfInt()));

//        System.out.println(mySumCount.sumOfArrayElements());
//
//        mySumCount.sumOfArrayElements();


        Thread thr1 = new MySumCount();

//        Thread thr2 = new MySumCount();

        thr1.start();
        System.out.println(mySumCount.getResultSum());
        thr1.join();


    }
}



