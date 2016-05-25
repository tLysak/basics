package com.brainacad.akuziakov.oop.Lesson7;

import java.util.Arrays;
import java.util.Random;

public class EntryPoint {

    private static final int RANGE = 9999999;

    public static void main(String[] args) {

        Computer[] computers = new Computer[]{
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer()
        };

        Arrays.toString(computers);

        Random random = new Random();
        for (Computer computer :
                computers) {
            computer.setSerialNumber(random.nextInt(RANGE));
        }

        for (Computer computer :
                computers) {
            float currentPrice = computer.getPrice();
            computer.setPrice(currentPrice * 1.1f);
        }

        for (Computer computer :
                computers) {
            System.out.println(computer.getCompterInfo());
        }
    }
}
