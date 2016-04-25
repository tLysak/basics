package com.brainacad.onesterenko.primitives;

public class Lesson3_2 {
    public static void main (String[]args){
        byte firstbyte = 6;
        byte secondbyte = 2;
        byte sum = (byte)(firstbyte + secondbyte);
        byte subtract = (byte)(secondbyte - firstbyte);
        byte division = (byte)(firstbyte/secondbyte);
        byte multiply = (byte) (firstbyte*secondbyte);
        byte percent =  (byte)(secondbyte%firstbyte);
        System.out.println("sum = " + sum);
        System.out.println("subtract = " + subtract);
        System.out.println("division = " + division);
        System.out.println("multiplication = " + multiply);
        System.out.println("percent = " + percent);
    }

}
