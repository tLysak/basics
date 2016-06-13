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

    public static <T extends Number & Comparable > Double calckSum(Double[] mass, T el){
        Double sum = Double.valueOf(0);
        for (Double t: mass) {
            if (t.compareTo((Double) el)> 0) {
                sum = sum+t;
            }
        }
        return sum;
    }

    public static <T extends Number & Comparable > Integer calckSum(Integer[] mass, T el){
        Integer sum = Integer.valueOf(0);
        for (Integer t: mass) {
            if (t.compareTo((Integer) el)> 0) {
                sum = sum+t;
            }
        }
        return sum;
    }

}
