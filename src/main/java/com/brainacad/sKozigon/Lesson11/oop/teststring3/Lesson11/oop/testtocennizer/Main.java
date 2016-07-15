package com.brainacad.skozigon.Lesson11.oop.teststring3.Lesson11.oop.testtocennizer;

import java.util.StringTokenizer;

/**
 * Created by skozigon on 23.05.2016.
 */
public class Main {
    private static void parce_String(String s, String token){
        StringTokenizer str = new StringTokenizer(s, token);
        while (str.hasMoreTokens())
            System.out.println(str.nextToken());
    }

    public static void main(String[] args) {
        String myString = "This is String, split by StringTokenizer. Created by Student:Name of Student";

        System.out.println("Using space split: ");
        parce_String(myString, " ");
        System.out.println("-------------");

        System.out.println("Using don split:");
        parce_String(myString, ".");
        System.out.println("--------------");

        System.out.println("Using coma split:");
        parce_String(myString, ",");




    }
}
