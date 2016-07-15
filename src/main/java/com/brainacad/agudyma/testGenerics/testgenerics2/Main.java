package com.brainacad.agudyma.testGenerics.testgenerics2;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by User on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        int maxElmInt = 3;

        Integer[] arrOfInt = new Integer[10];
        Random random = new Random();
        for (int i=0 ; i < arrOfInt.length ; i++ ) {
            arrOfInt[i] = random.nextInt(10);}

        Double arrOfDouble[] = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};

        Integer biggerInteger = MyTestMethod.calcNumInt(arrOfInt,maxElmInt);
        Integer sumOfIntegers = MyTestMethod.calcSumInt(arrOfInt,maxElmInt);

        Integer biggerDouble = MyTestMethod.calcNumDouble(arrOfDouble,3);


        System.out.println("Integer values: " + Arrays.toString(arrOfInt));

        System.out.println("Double values: " + Arrays.toString(arrOfDouble));
        System.out.println("Number of integers that are greater than " + maxElmInt+ " :" + biggerInteger);
        System.out.println("Sum of integers that are greater than "+ maxElmInt+ " :"  + sumOfIntegers);

        System.out.println("Number of doubles that are greater than 3: " + biggerDouble);
    }



}
