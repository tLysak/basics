package com.brainacad.agudyma.testWrapper.testWrapper.testWrapper1;

/**
 * Created by User on 25.05.2016.
 */
public class Main {


    public Main(){

        return;
    }



    public static void main (String  [] args){
        int x1 = 10;
        int x2 = new Integer(10);
        Integer x3 = Integer.valueOf(10);

        int x4 = Integer.parseInt("10");
        System.out.println(x1 == x2);
        System.out.println(x3.equals(x1)  );
        System.out.println(x3.equals(x4));
        System.out.println(x3 ==x4);

    }
}
//Create new project called  WrapperDemo2.
//        Add package “com.brainacad.oop.testwrapper2”.
//        Create class Main with method main().
//        Add to class Main static method compute( , ) that use as argument s two different numeric wrapper classes,
//   adds the values of the two instances together, and then creates a third numeric wrapper instance whose value is the
//      sum and return it.
//        For example:
//static method compute(Byte, Integer) witch return Long type.
//        In method main() write code to invoke compute(,) and print result to console.
//        Execute the program.