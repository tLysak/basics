package com.brainacad.lpyavka.primitives;

public class Lesson3_5 {
    public static void main(String[] args) {
        int value = 23;
        System.out.println("Initial value is " + value);
        int valueLeftShift = value << 3;
        System.out.println("Bit shift, LEFT, value is " + valueLeftShift);
        int valueRightShift = value >> 3;
        System.out.println("Bit shift, RIGHT, value is " + valueRightShift);
    }
}
