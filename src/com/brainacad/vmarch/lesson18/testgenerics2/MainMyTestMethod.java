package com.brainacad.vmarch.lesson18.testgenerics2;


public class MainMyTestMethod {

    public static void main(String[] args) {

        Integer[] arrInteg = {4, 8, 2, 1, 6, 7, 8, 5, 4};
        Double[] arrDoub = {6.5, 4.7, 5.2, 6.4, 7.8, 8.9, 9.9, 3.5};

        MyTestMethod.calcNum(arrInteg, 5);
        MyTestMethod.calcNum(arrDoub, 6.3);

    }
}
