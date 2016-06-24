package com.brainacad.skozigon.Labs.lads2_17.testthread2;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created by skozigon on 23.06.2016.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        int[] myArray = new int[1000];

        MySumCount mySumCount1 = new MySumCount();
        MySumCount mySumCount2 = new MySumCount();
        Random random = new Random();

        for (int i: myArray) {
            i=random.nextInt();
        }

        mySumCount1.setArr(myArray);
        mySumCount2.setArr(myArray);

        mySumCount1.setStartIndex(random.nextInt());
        mySumCount1.setStopIndex(mySumCount1.getStartIndex()+3);

        mySumCount2.setStartIndex(random.nextInt());
        mySumCount2.setStopIndex(mySumCount2.getStartIndex()+3);

        Thread th1 = new Thread(mySumCount1);
        Thread th2 = new Thread(mySumCount2);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(mySumCount1.getResultSum() + mySumCount2.getResultSum());

//        try {
//            if(th1.isAlive()){
//                th2.join();
//            } else{
//                th1.join();
//            }
//
//        } catch (InterruptedException e) {
//            System.out.println("Summary is: " + (mySumCount1.getResultSum() + mySumCount2.getResultSum()));
//        }

    }
}
