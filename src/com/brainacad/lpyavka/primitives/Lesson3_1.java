package com.brainacad.lpyavka.primitives;

public class Lesson3_1 {
    public static void main(String[] args) {
        byte valueDecimal = (byte) 122.5;
        System.out.println("Byte in decimal number: " + valueDecimal);
        short valueOctal = 0172;
        System.out.println("Short in octal format: " + valueOctal);
        int valueCharLiteral = 'Ģ';
        System.out.println("Int in character literal: " + valueCharLiteral);
        long valueDecimalLong = 122L;
        System.out.println("Long in decimal format: " + valueDecimalLong);
        float valueHexadecimal = (float) 122.5E-2;
        System.out.println("Float with exponent in hexadecimal format: " + valueHexadecimal);
        double valueFloatLiteral = 122.5f;
        System.out.println("Double in float literal " + valueFloatLiteral);
        char valueIntLiteral = 0x7A;
        System.out.println("Char in hexadecimal format: " + valueIntLiteral);
        boolean valueLiteral = true;
        System.out.println("Boolean literal: " + valueLiteral);
    }
}
