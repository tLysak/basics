package com.brainacad.vmarch.primitives;

public class Lesson3_2 {
    public static void main(String[] args) {
        byte a = (byte) 0b11010000;
        byte b = (byte) 0b00011100;
        byte c = (byte) (a + b);
        byte d = (byte) (a - b);
        byte e = (byte) (a / b);
        byte f = (byte) (a * b);
        byte g = (byte) (a % b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

    }
}
