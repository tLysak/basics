package com.brainacad.akuziakov.lesson17.testgenerics1;

import java.util.DoubleSummaryStatistics;

public class Main {
    public static void main(String[] args) {

        MyTuple<String, Integer, Long> myTuple1=new MyTuple<>("aaa", 12, 11L);
        MyTuple<Double, String, String> myTuple2=new MyTuple<>(36.6, "36.6", "high temperature");
    }
}
