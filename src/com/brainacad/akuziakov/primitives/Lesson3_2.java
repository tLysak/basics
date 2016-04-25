package com.brainacad.akuziakov.primitives;

public class Lesson3_2 {
    public static void main(String[] args) {

        byte byteValue1 = 37;
        byte byteValue2 = 4;

        byte byteSum = (byte) (byteValue1 + byteValue2);
        byte byteDifference = (byte) (byteValue1 - byteValue2);
        byte byteDivision = (byte) (byteValue1 / byteValue2);
        byte byteMultiplication = (byte) (byteValue1 * byteValue2);
        byte byteReminder = (byte) (byteValue1 % byteValue2);

        System.out.printf("Sum of byte %d and byte %d is: %d.\n", byteValue1, byteValue2, byteSum);
        System.out.printf("Difference between byte %d and byte %d is: %d.\n", byteValue1, byteValue2, byteDifference);
        System.out.printf("Division of byte %d by byte %d is: %d.\n", byteValue1, byteValue2, byteDivision);
        System.out.printf("Multiplication of byte %d and byte %d is: %d.\n", byteValue1, byteValue2, byteMultiplication);
        System.out.printf("Reminder after division of byte %d by byte %d is: %d.\n", byteValue1, byteValue2, byteReminder);
    }
}
