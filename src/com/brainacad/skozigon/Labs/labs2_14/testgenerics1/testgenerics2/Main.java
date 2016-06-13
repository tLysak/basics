package com.brainacad.skozigon.Labs.labs2_14.testgenerics1.testgenerics2;

/**
 * Created by skozigon on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] int_mass = {1, 2, 10, 58, 43, 27, 98, 100};
        Double[] double_mass = {1.2, 5.4, 4.8, 0.8, 1.3, 0.3, 1.1, 2.6};

        System.out.println("Number of elements that are greater than a 10: " + MyTestMethod.calckNum(int_mass, 10));
        System.out.println("Number of elements that are greater than a 1.2: " + MyTestMethod.calckNum(double_mass,1.2d));

        System.out.println("Summary of elements that are greater than a 10: " + MyTestMethod.calckSum(int_mass, 10));
        System.out.println("Summary of elements that are greater than a 1.2: " + MyTestMethod.calckSum(double_mass, 1.2));

    }
}
