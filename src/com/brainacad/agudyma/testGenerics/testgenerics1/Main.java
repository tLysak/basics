package com.brainacad.agudyma.testGenerics.testgenerics1;

/**
 * Created by User on 06.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTuple<String, Integer, Long> tuple1 = new MyTuple<>("Ace", 111, 111l);
        MyTuple<Double, String, String> tuple2 = new MyTuple<>(222d, "Spades", "Diamonds");
        System.out.println(tuple1.toString());
        System.out.println(tuple2.toString());

    }
}
