package com.brainacad.akuziakov.lesson19.lab_2_15_4.testmygen;

public class Main {

    public static void main(String[] args) {
        MyNumGenerator myNumGenerator = new MyNumGenerator(5, 64);

        myNumGenerator.generate().forEach(System.out::println);
    }
}
