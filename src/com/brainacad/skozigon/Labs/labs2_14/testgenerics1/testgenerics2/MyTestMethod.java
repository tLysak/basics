package com.brainacad.skozigon.Labs.labs2_14.testgenerics1.testgenerics2;

/**
 * Created by skozigon on 06.06.2016.
 */
public class MyTestMethod  {



    public static <T extends Comparable> int calckNum(T[] mass, T el){
        int i=0;
        for (T t: mass) {
            if (t.compareTo(el)> 0) {
                i++;
            }
        }
        return i;
    }

    public static <T extends Number > Double calckSum(T[] mass, T el){
        double sum = 0;
        for (Number t: mass) {
            if (t.doubleValue() >  el.doubleValue()) {
                sum += t.doubleValue();
            }
        }
        return sum;
    }

}
