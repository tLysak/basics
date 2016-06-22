package com.brainacad.akuziakov.lesson21.lab_2_8_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        foo(1, 4);
        foo(1, 4, 7);
    }

    static void foo(final int a, final int b) {
        System.out.println(a + " " + b);
    }

    static void foo(int... a) {
        System.out.println(Arrays.toString(a));
    }
}
