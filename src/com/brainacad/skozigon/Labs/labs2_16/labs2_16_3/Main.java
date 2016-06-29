package com.brainacad.skozigon.Labs.labs2_16.labs2_16_3;

/**
 * Created by skozigon on 17.06.2016.
 */
public class Main {
    static void foo(int a, int b){
        System.out.println("a = " + a + "\nb = " + b);
    }

    static void foo(int... a){
        for (int i: a) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        foo(5, 6);
        foo(1, 2, 3, 4);
    }
}
