package com.brainacad.skozigon.Labs.labs2_14.testgenerics1;

/**
 * Created by skozigon on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple myTuple1 = new MyTuple("Hi", 10, 100l);
        MyTuple myTuple2 = new MyTuple(150.5d, "By", "by By");

        System.out.println("First object: " + myTuple1.getA() + " " + myTuple1.getB() + " " + myTuple1.getC());
        System.out.println("Second object: " + myTuple2.getA() + " " + myTuple2.getB() + " " + myTuple2.getC());

    }
}
