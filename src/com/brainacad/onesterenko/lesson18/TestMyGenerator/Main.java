package com.brainacad.onesterenko.lesson18.testMyGenerator;

/**
 * Create a class MainWrapper1 with a main( ) method.
 Add to method main() code to create instance of MyNumGenerator (for example with 5,64 parameters)
 and print result of invoking generate() method to console.
 Execute the program.
 The program output must be like next example:
 [43,15,60,2,5]
 */
public class Main {
    public static void main(String[] args) {
        MyNumGenerator generator = new MyNumGenerator(5,64);
        System.out.println(generator.generate());
        System.out.println(generator.generateDistinct());
    }
}
