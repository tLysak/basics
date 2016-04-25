package com.brainacad.akuziakov.primitives;

public class Lesson3_3 {
    public static void main(String[] args) {

        boolean case1 = true;
        boolean case2 = false;

        System.out.printf("Result of AND operation for %b and %b is: %b.\n", case1, case2, case1 & case2);
        System.out.printf("Result of OR operation for %b and %b is: %b.\n", case1, case2, case1 | case2);
        System.out.printf("Result of NOT operation for %b is %b and for %b is %b.\n", case1, case2, !case1, !case2);
        System.out.printf("Result of XOR operation for %b and %b is %b.\n", case1, case2, case1 ^ case2);
    }
}
