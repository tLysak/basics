package com.brainacad.onesterenko.lesson20;

/**
 *
 Create new project called  TestThread1.
 Add package “com.brainacad.oop.testthread1”.
 In this exercise, you will create a simple counting thread. It will count to 10, pausing
 one second between each number. Also, in keeping with the counting theme, it will
 output a string every ten numbers.
 1. Create a class MyTimeBomb which extends the Thread class.
 2. Override the run()  method of Thread. This is where the code will go that
 will output to console the numbers  from 10 to 0 and after that prints “Boom!!!” .
 4. Use the static method Thread.sleep()  to pause for one second.
 (Remember, the one-arg version of sleep()  specifies the amount of time of sleep in milliseconds.)
 Create a class Main with a main( ) method.
 Add to method main() code that declares local variable “bomb1” of MyTimeBomb  type, and create instance of  MyTimeBomb.
 Add code to invoke start() method.
 Execute the program.
 The program output must be like next example:
 10
 9
 8
 7
 6
 5
 4
 3
 2
 1
 0
 Boom!!!

 */
public class TestThread1 {
    public static void main(String[] args) {
        MyTimeBomb bomb1 = new MyTimeBomb();
        bomb1.run();
    }

}
