package com.brainacad.skozigon.lesson24;

/**
 * Created by skozigon on 04.07.2016.
 */
public class Runt {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        long a, b;
        System.out.println("Free memory: " + (a = run.freeMemory()));
        int[] x = new int[20000000];
        System.out.println("Free Memory: " + (b = run.freeMemory()));
        System.out.println(b-a);
    }
}
