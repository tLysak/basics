package com.brainacad.onesterenko.lesson12;

/**
 * Created by user on 24.05.2016.
 */
public class TestStrings1 {
    public static void main(String[] args) {
        String myStr = "abracadabra";

        System.out.println("First ra at " + myStr.indexOf("ra"));
        System.out.println("LAst ra at " + myStr.lastIndexOf("ra"));
        System.out.println("substring of 3-7 chars: " + myStr.substring(3,7));


    }

    static String reverseString (String str) {
        String a = str;
        StringBuilder sb = new StringBuilder();

        sb.append(a);
        sb.reverse();


        return a;
    }
}