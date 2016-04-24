package com.brainacad.lpyavka.primitives;

public class Lesson3_2 {
    public static void main(String[] args) {
        byte value1 = 120;
        byte value2 = 10;

        byte sumResult = (byte) (value1 + value2);
        byte subtractResult = (byte) (value1 - value1);
        byte divisionResult = (byte) (value1 / value2);
        byte multiplyResult = (byte) (value1 * value2);
        byte reminderResult = (byte) (value1 % value2);
        System.out.println(value1 + " + " + value2 + " = " + sumResult);
        System.out.println(value1 + " - " + value2 + " = " + subtractResult);
        System.out.println(value1 + " / " + value2 + " = " + divisionResult);
        System.out.println(value1 + " * " + value2 + " = " + multiplyResult);
        System.out.println(value1 + " % " + value2 + " = " + reminderResult);
    }
}
