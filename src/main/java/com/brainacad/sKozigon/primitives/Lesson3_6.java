package com.brainacad.skozigon.primitives;


public class Lesson3_6 {
    public static void main(String[] args) {
        int a = 4, b = 2;
        System.out.println("Integer variable a = " + a + "\tb = " + b);
        System.out.println("a & b = " + (a & b) + " in boolean a = " + Integer.toBinaryString(a) + "\tin boolean b = " + Integer.toBinaryString(b));
        System.out.println("a | b = " + (a | b) +" in boolean a = " + Integer.toBinaryString(a) + "\tin boolean b = " + Integer.toBinaryString(b));
        System.out.println("~a = " + ~a + " in boolean a = " + Integer.toBinaryString(~a));

    }
}
