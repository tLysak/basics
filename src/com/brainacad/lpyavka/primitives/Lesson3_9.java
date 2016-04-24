package com.brainacad.lpyavka.primitives;

public class Lesson3_9 {
    public static void main(String[] args) {

        int number = 4;
        boolean case1 = true;
        boolean case2 = 6 % 2 > 1;
        System.out.println(case1 || case2 ? 2 + 34 * 2 : number++ + 2 < ++number);
        System.out.println("1st step: (6 % 2) > 1 = false");
        System.out.println("2nd step: 2 + (34 * 2) = 70");
        System.out.println("3rd step: ((number++) + 2) < ++number = false ");
        System.out.println("RESULT: true || false ? 70 : false = 70");
    }
}
