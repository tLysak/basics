package com.brainacad.onesterenko.lesson20.testThread2;

/**
 * Add to method main() code that declares local variable “bomb1” of MyTimeBomb  type, and create instance
 * of  MyTimeBomb. Add code to execute MyTimeBomb in new thread (Using the Thread class). Execute the program.

 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        bomb1.run();
    }

}
