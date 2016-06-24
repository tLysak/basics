package com.brainacad.skozigon.Labs.labs2_16.labs2_16_2;

/**
 * Created by skozigon on 17.06.2016.
 */
public class Main {
    static void foo(int i){
        System.out.println("int");
    }

    static void foo(Byte b){
        System.out.println("Byte");
    }

    public static void main(String[] args) {

        byte b = 8;
        foo(b);
    }
}
