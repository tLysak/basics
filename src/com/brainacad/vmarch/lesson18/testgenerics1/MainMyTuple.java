package com.brainacad.vmarch.lesson18.testgenerics1;


public class MainMyTuple {

    public static void main(String[] args) {

        MyTuple<String, Integer, Long> myTuple1 = new MyTuple<>("REW", 123, 999L);
        MyTuple<Double, String, String> myTuple2 = new MyTuple<>(90.9, "gRE", "ooP");

        System.out.println(myTuple1.toString());
        System.out.println(myTuple2.toString());

    }
}
