package com.brainacad.agudyma.testGenerics.testgenerics2;

import com.brainacad.agudyma.oop.testNested1.Comparable;

import java.util.Arrays;

/**
 * Created by User on 06.06.2016.
 */
public class MyTestMethod  {

    public static  <T extends Comparable>  int calcNumInt(Integer[] a, int maxeLm) {

        Arrays.sort(a);
               int counter = 0;
        for (Integer element:  a  ) {
            if (element.compareTo(maxeLm) > 0){
                counter++;

            }
        }
        return counter;
        }

    public static  <T extends Comparable>  int calcSumInt(Integer[] a, int maxeLm) {

        Arrays.sort(a);
        int sum = 0;

        for (Integer element:  a  ) {
            if (element.compareTo(maxeLm) > 0){


                sum += element;

            }
        }
        return sum;
    }

    public static  <T extends Comparable>  int calcNumDouble(Double[] a, int maxeLm){


//            T element = <T> a[maxeLm];

        return 0;

    }



}
