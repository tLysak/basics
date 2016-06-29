package com.brainacad.agudyma.oop.methodOverload3;

import java.util.Arrays;

/**
 * Created by User on 17.06.2016.
 */
public class Main {

    public static void foo(int a, int b){
    System.out.println(a+ " " +b);
    }
    public static void foo(int... a){
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int a = 1 ;
                int b = 2;

        foo(a,b);
        foo(1,2,3);
    }
}
