package com.brainacad.vmarch.lesson12.testtokennizer;


import java.util.StringTokenizer;

public class TestTokennizer {

    public static void main(String[] args) {

        String myStr = "This is String, split by StringTokenizer. Created by Student:Vovas";

        StringTokenizer tok = new StringTokenizer(myStr, " ,.");

        while (tok.hasMoreTokens()) {

            System.out.println(tok.nextToken());

        }
    }
}
