package com.brainacad.skozigon.Labs.labs2_15.testmygen;

/**
 * Created by skozigon on 15.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(10, 100);

        System.out.println("Execute generate() method: ");
        System.out.println(myNumGenerator.generate());

        System.out.println("Execute generateDistinct() method:");
        System.out.println(myNumGenerator.generateDistinct());
    }
}
