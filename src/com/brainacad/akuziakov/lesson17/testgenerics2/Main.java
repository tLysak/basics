package com.brainacad.akuziakov.lesson17.testgenerics2;

import java.util.DoubleSummaryStatistics;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Integer[] intArr=new Integer[10];
        Double[] dArr=new Double[10];

        fillIntArr(intArr);
        dArr=fillDArr(dArr);

        System.out.println(MyTestMethod.calcNum(intArr, Integer.valueOf(5)));
        System.out.println(MyTestMethod.calcNum(dArr, Double.valueOf(6.6)));
    }

    private static Double[] fillDArr(final Double[] dArr) {
        Random rnd=new Random();
        for(int i=0;i<dArr.length;i++){
            dArr[i]=new Double(rnd.nextDouble()%10);
        }
        return dArr;
    }

    private static Integer[] fillIntArr(final Integer[] intArr) {
        Random rnd=new Random();
        for(int i=0;i<intArr.length;i++){
            intArr[i]=new Integer(rnd.nextInt()%10);
        }
        return intArr;
    }
}
