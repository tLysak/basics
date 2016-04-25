package com.brainacad.akuziakov.primitives;

public class Lesson3_9 {
    public static void main(String[] args) {

        int number = 4;
        boolean case1 = true;
        boolean case2 = 6 % 2 > 1;

        System.out.println(case1 || case2 ? 2 + 34 * 2 : number++ + 2 < ++number);
    }
}
