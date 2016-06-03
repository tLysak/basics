package com.brainacad.skozigon.lesson13.oop.testwrapper.lesson13.oop.testwrapper2;



public class Main {
    public static void main(String[] args) {

        compute(10, 15.2f);

    }
    static void compute(Integer i, Float f ){
        Double d = Double.valueOf(i+f);
        System.out.println("Result = " + d);
    }

}
