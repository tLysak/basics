package com.brainacad.lpyavka.primitives;

public class Lesson3_3 {
    public static void main(String[] args) {
        boolean valueA = true;
        boolean valueB = false;
        boolean resultAnd = valueA & valueB;
        boolean resultOr = valueA | valueB;
        boolean resultNot = !valueA;
        boolean resultXor = valueA ^ valueB;

        System.out.println("true AND false= " + resultAnd);
        System.out.println("true OR false= " + resultOr);
        System.out.println("NOT true= " + resultNot);
        System.out.println("true XOR false= " + resultXor);
    }
}
