package com.brainacad.agudyma.testWrapper.testWrapper.testWrapper2;

/**
 * Created by User on 25.05.2016.
 */
public class Main {
    public static byte x1;
    public static int x2;

    public static long compute (Byte x1, Integer x2){
          long x3 =x1 +x2;
        return  x3;
    }

    public static void main (String[]args){
        byte x1 =1;

        int x2 =1;
        System.out.println(compute(x1,x2));
    }

}
//Create new project called  WrapperDemo2.
//        Add package “com.brainacad.oop.testwrapper2”.
//        Create class Main with method main().
//        Add to class Main static method compute( , ) that use as argument s two different numeric wrapper classes,
// adds the values of the two instances together, and then creates a third numeric wrapper instance whose value is the
// sum and return it.
//        For example:
//static method compute(Byte, Integer) witch return Long type.
//        In method main() write code to invoke compute(,) and print result to console.
////        Execute the program.