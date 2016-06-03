package com.brainacad.agudyma.oop.testString3;

import java.util.Arrays;

/**
 * Created by User on 23.05.2016.
 */
public class Main {
    String s;
    int i;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    private String uniqueChars() {
        String uniqueChars = Arrays.toString(s.toCharArray());
        return uniqueChars;
    }

    public static void main(String[] args) {
        String input = "These are string methods";
        char[] s = input.toCharArray();
        System.out.println(Arrays.toString(input.toCharArray()));
        StringBuilder sb1 = new StringBuilder(input);
        System.out.println(sb1);




        }

    }
