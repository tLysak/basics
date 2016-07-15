package com.brainacad.skozigon.primitives;


public class Lesson3_3 {
    public static void main(String[] args) {
        boolean b1 = true, b2 = false;
        System.out.println("Boolean variables:\nb1 = " + b1 + "\tb2 = " + b2);
        System.out.println("b1 AND b2 result: " + (b1 &b2));
        System.out.println("b1 OR b2 result: " + (b1 | b2));
        System.out.println("!b1 and !b2 result: " + !b1 + " " + !b2);
        System.out.println("b1 XOR b2 result: " + (b1 ^ b2));
    }
}
