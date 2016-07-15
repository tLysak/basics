package com.brainacad.onesterenko.lesson13;

/**
 * Create new project called  WrapperDemo2.
 Add package “com.brainacad.oop.testwrapper2”.
 Create class MainWrapper1 with method main().
 Add to class MainWrapper1 static method compute( , ) that use as argument s two different numeric
 wrapper classes, adds the values of the two instances together, and then creates a third numeric
 wrapper instance whose value is the sum and return it.
 For example:
 static method compute(Byte, Integer) witch return Long type.
 In method main() write code to invoke compute(,) and print result to console.
 Execute the program.

 */
public class testwrapper2 {
    public static void main(String[] args) {

        System.out.println(  compute(23,(byte)5));

    }

    static Long compute(Integer integ, Byte byte1) {
       Long b = (long)(integ + byte1);
        return b;
    }
}
