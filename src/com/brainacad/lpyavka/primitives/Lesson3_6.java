package com.brainacad.lpyavka.primitives;

public class Lesson3_6 {
    public static void main(String[] args) {
        int valueOne = -4;
        int valueTwo = 2;
        int resultAnd = valueOne & valueTwo;
        int resultOr = valueOne | valueTwo;
        int resultXor = valueOne ^ valueTwo;
        int resultBitwiseComplement = ~valueOne;
        System.out.println(valueOne + " AND " + valueTwo + " = " + resultAnd);
        System.out.println(valueOne + " OR " + valueTwo + " = " + resultOr);
        System.out.println(valueOne + " XOR " + valueTwo + " = " + resultXor);
        System.out.println(valueOne + " BITWISE COMPLEMENT " + resultBitwiseComplement);
    }
}
