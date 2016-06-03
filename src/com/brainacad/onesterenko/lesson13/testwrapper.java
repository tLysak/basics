package com.brainacad.onesterenko.lesson13;

/**
 * Create new project called WrapperDemo.
 Add package “com.brainacad.oop.testwrapper”.
 Create class Main with method main(). In main() method declare few xN local variable of Integer class and initialize it
 with same value (lower then 128), but in different manner.
 For example:
 Integer x1 = 10;
 Integer x2 = new Integer(10);
 Integer x4 = Integer.valueOf(10);
 Integer x5 = Integer.parseInt(“10”);
 Compare it to each other using “==” and equals(), print result to console.
 Do the same, but for value higher than 128.
 */
public class testwrapper {
    public static void main(String[] args) {
        Integer x1 = new Integer(55);
        Integer x2 = new Integer(55);
        int x3 = 55;
        Integer x4 = Integer.valueOf(55);
        Integer x5 = Integer.parseInt("55");
        System.out.println(x1.equals(x2));
        System.out.println(x2==x3);
        System.out.println(x3 == x4);
        System.out.println(x4 ==x5);


    }
}
