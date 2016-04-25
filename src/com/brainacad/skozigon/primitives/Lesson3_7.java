package com.brainacad.skozigon.primitives;


import java.util.Random;

public class Lesson3_7 {
    public static void main(String[] args) {
        int i = (((new Random().nextInt((int) System.currentTimeMillis())) % 2 > 0)) ? (i = 10) : (i = 20);
        System.out.println("Integer i = " + i);
    }
}
