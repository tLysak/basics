package com.brainacad.agudyma.oop.methodOverload2;

/**
 * Created by User on 17.06.2016.
 */
public class Main {
    public static void foo(int i){
        System.out.println("int");
    }

    public static void foo(Byte b){
        System.out.println("Byte");
    }
    public static void main(String[] args) {
        int i = 1;
        Byte b = 15;
        foo(i);
        foo(b);
    }
}


