package com.brainacad.agudyma.testGenerics.testgenerics2;

/**
 * Created by User on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] arrayInteger ={1,2,3,4,5,6,7,8,9};
        Double [] arrayDouble = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        Integer biggerInteger = MyTestMethod.calcNum(arrayInteger,3);
        Integer biggerDouble = MyTestMethod.calcNum(arrayDouble,3);

        System.out.println("Number of elements that are greater than 3: ");
        System.out.println();
    }



}
