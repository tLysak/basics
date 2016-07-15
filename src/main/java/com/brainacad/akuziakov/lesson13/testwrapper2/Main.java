package com.brainacad.akuziakov.lesson13.testwrapper2;

public class Main {
    public static void main(String[] args) {
        System.out.println(compute((byte)127, 5000000));
    }

    static long compute(final Byte byteVal, final Integer intVal){
        return new Long(byteVal+intVal);
    }
}
