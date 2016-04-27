package com.brainacad.akuziakov.primitives;

public class Lesson3_6 {
    public static void main(String[] args) {
        int firstInt = 4;
        int secondInt = 2;

        int andResult = firstInt & secondInt;
        int orResult = firstInt | secondInt;
        int xorResult = firstInt ^ secondInt;
        int notFirstIntResult = ~firstInt;

        System.out.println(firstInt + " & " + secondInt + " = " + andResult);
        System.out.println(firstInt + " | " + secondInt + " = " + orResult);
        System.out.println(firstInt + " ^ " + secondInt + " = " + xorResult);
        System.out.println("~" + firstInt + " = " + notFirstIntResult);
    }
}
