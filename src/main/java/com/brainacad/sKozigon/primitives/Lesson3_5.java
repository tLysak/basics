package com.brainacad.skozigon.primitives;


public class Lesson3_5 {
    public static void main(String[] args) {
        int i = 100;
        System.out.println("Integer variable i = 100. In boolean: " + Integer.toBinaryString(i));
        System.out.println("i>>3 = " + (i = i>>3) + "\tIn boolean: " + Integer.toBinaryString(i));
    }
}
