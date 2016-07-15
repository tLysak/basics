package com.brainacad.akuziakov.primitives;

public class Lesson3_1 {
    public static void main(String[] args) {

        byte byteValue = (byte) 3.14;
        System.out.println("Decimal value 3.14, stored in byte type variable: " + byteValue);

        short shortValue = 0144;
        System.out.println("Value of 100 in octal format, stored in short type variable: " + shortValue);

        int intValue = 'V';
        System.out.println("Character literal \"V\", stored in int type variable: " + intValue);

        long longValue = 100L;
        System.out.println("Value of 100, stored in long type variable: " + longValue);

        float floatValue = 3.14e5F;
        System.out.println("Value of hexadecimal number in exponential format, stored in float type variable: " + floatValue);

        double doubleValue = 314F;
        System.out.println("Value float literal, stored in double type variable: " + doubleValue);

        char charValue = 0x0056;
        System.out.println("Value of integer number 86 in hexadecimal format, stored in char type variable: " + charValue);

        boolean booleanValue = true;
        System.out.println("Value of boolean literal \"true\", stored in boolean type variable: " + booleanValue);
    }
}
