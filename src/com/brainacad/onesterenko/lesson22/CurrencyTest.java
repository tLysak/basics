package com.brainacad.onesterenko.lesson22;

/**
 * Created by User on 04/07/2016.
 */
public class CurrencyTest {
    public static void main(String[] args) {


        Runtime run = Runtime.getRuntime();
        System.out.println("freeMemory " + run.freeMemory());

        int[] x = new int[44_000_000];
        System.out.println("free momory " + run.freeMemory());

    }
}
