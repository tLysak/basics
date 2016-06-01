package com.brainacad.skozigon.Lesson11.oop.teststring3;

import java.util.Arrays;

/**
 * Created by skozigon on 23.05.2016.
 */
public class Main {
    private static void   uniqueChars(String s){
        String[] str = s.split("");

        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(str));
        for (String ch: str) {
            if(s.contains(ch) && !sb.toString().contains(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    private static void new_uniqueChars(String s){

    }

    public static void main(String[] args) {

        String string = "Using methods of class String";
        uniqueChars(string);

    }
}
