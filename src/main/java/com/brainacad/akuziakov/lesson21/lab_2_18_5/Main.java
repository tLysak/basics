package com.brainacad.akuziakov.lesson21.lab_2_18_5;

public class Main {

    public static void main(String[] args) {
        byte b = 5;

        foo(b);
        foo(5);
    }

    static void foo(final int i) {
        System.out.println("int");
    }

    static void foo(final byte b) {
        System.out.println("byte");
    }
}
