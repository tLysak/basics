package com.brainacad.vmarch.labs.finalizationgc;

/**
 * Created by User on 29/07/2016.
 */
public class MainFinalization1 {
    public static void main(String[] args) throws InterruptedException {
        Finalization1 obj1 = new Finalization1(12345);
        obj1 = null;
        System.out.println("The One: " + obj1);
        System.gc();
        Thread.sleep(500);
        System.out.println("obj1 = " + obj1);
    }
}
