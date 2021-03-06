package com.brainacad.onesterenko.lesson20.testThread2;

import static java.lang.Thread.sleep;

/**
 * Open project called  MyTimeBomb.
 In this exercise, you will create a simple counting thread by implement the Runnable interface.
 It will count to 10, pausing one second between each number. Also, in keeping with the counting theme, it will output a string every ten numbers.
 1. Rewrite the MyTimeBomb class to implement the Runnable interface.
 2. Override the run()  method. This is where the code will go that
 will output to console the numbers  from 10 to 0 and after that prints “Boom!!!” .
 4. Use the static method Thread.sleep()  to pause for one second.
 (Remember, the one-arg version of sleep()  specifies the amount of time of sleep in milliseconds.)
 Create a class MainMyPhoneBook with a main( ) method.
 Add to method main() code that declares local variable “bomb1” of MyTimeBomb  type, and create instance of  MyTimeBomb.
 Add code to execute MyTimeBomb in new thread (Using the Thread class). Execute the program.
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
public class MyTimeBomb implements Runnable {
    @Override
       public void run() {
            for (int i=10;i>=0; i--){
                System.out.println(i);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println("Allah Akbar");
    }
}
