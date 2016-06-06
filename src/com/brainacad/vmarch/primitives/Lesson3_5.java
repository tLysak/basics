package com.brainacad.vmarch.primitives;

public class Lesson3_5 {
    public static void main(String[] args) {
        int a = 345;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(">>2 = " + Integer.toBinaryString(a >> 2));
        System.out.println("<<3 = " + Integer.toBinaryString(a << 3));
        System.out.println(">>>4 = " + Integer.toBinaryString(a >>> 4));
    }
}
