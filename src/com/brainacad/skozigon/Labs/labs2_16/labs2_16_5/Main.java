package com.brainacad.skozigon.Labs.labs2_16.labs2_16_5;

/**
 * Created by skozigon on 17.06.2016.
 */
public class Main {
    static void foo(int i){
        System.out.println("int");
    }

    static void foo(byte b){
        System.out.println("byte");
    }

    public static void main(String[] args) {
        byte b = 5;
        foo(b);
        foo(5);
    }
}
