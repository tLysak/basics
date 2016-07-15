package com.brainacad.skozigon.primitives;

public class Lesson3_2 {
    public static void main(String[] args) {
        byte b1 = 5, b2 = 13;
        System.out.println("Two byte-type variable:\nb1 = " + b1 + "\tb2 = " + b2);
        byte a = (byte) (b1 + b2);
        System.out.println("b1 + b2 = " + a);
        byte c = (byte) (b2 - b1);
        System.out.println("b2 - b1 = " + c);
        float d =  (float)b2/b1;
        System.out.println("b2 / b1 = " + d);
        byte m = (byte) (b1 * b2);
        System.out.println("b1 * b2 = " + m);
        byte mod = (byte) (b2 % b1);
        System.out.println("b2 % b1 = " +mod);
    }
}
