package com.brainacad.akuziakov.lesson13.testwrapper;

public class Main {
    public static void main(String[] args) {
        Integer x1 = 10;
        Integer x2 = new Integer(10);
        Integer x4 = Integer.valueOf(10);
        Integer x5 = Integer.parseInt("10");
        System.out.println(x1 == x2);
        System.out.println(x1 == x4);
        System.out.println(x1 == x5);
        System.out.println(x2 == x4);
        System.out.println(x2 == x5);
        System.out.println(x4 == x5);
        System.out.println("/////////////////////////");
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x4));
        System.out.println(x1.equals(x5));
        System.out.println(x2.equals(x4));
        System.out.println(x2.equals(x5));
        System.out.println(x4.equals(x5));
    }
}
