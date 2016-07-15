package com.brainacad.vmarch.lesson13.wrapperdemo2;


import static java.lang.Long.sum;

public class Wrappers2 {


    private static Byte a;
    private static Integer b;
    private static Long c;

    public static Long getC() {
        return c;
    }

    public static void setC(Long c) {
        Wrappers2.c = c;
    }

    public static Integer getB() {
        return b;
    }

    public static void setB(Integer b) {
        Wrappers2.b = b;
    }

    public static Byte getA() {
        return a;
    }

    public static void setA(Byte a) {
        Wrappers2.a = a;
    }


    public static Long compute(Byte a, Integer b) {

        c = sum(a, b);
        return c;
    }
}
