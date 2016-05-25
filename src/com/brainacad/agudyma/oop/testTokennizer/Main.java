package com.brainacad.agudyma.oop.testTokennizer;

import java.util.StringTokenizer;

/**
 * Created by User on 23.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "This is String, split by StringTokenizer. Created by Student:Name of Student";
        StringTokenizer stringTokenizer = new StringTokenizer(myStr);
        while (stringTokenizer.hasMoreElements()){
            System.out.println(stringTokenizer.nextToken(" ,.:"));
        }
    }
}
