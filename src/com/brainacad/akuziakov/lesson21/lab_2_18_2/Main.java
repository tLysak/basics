package com.brainacad.akuziakov.lesson21.lab_2_18_2;

public class Main {

    public static void main(String[] args) {

        byte b = (byte) 127;
        foo(b);
    }

    static void foo(final int i) {
        System.out.println("int");
    }

    static void foo(final Byte b) {
        System.out.println("Byte");
    }
}
