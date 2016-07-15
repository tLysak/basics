package com.brainacad.lpyavka.lesson5.oop;

import java.util.Random;

public class MainComputer {
    private static final int RANGE = 999999;

    public static void main(String[] args) {

        Computer[] computer = new Computer[10];

        for (int i = 0; i < 10; i++) {
            computer[i] = new Computer();
        }

        Random random = new Random();
        for (Computer currentComputer : computer) {
            currentComputer.setSerialNumber(random.nextInt(RANGE));
        }
        for (Computer currentComputer : computer) {
            float currentPrice = currentComputer.getPrice();
            currentComputer.setPrice(currentPrice * 1.1f);
        }

        for (Computer currentComputer : computer) {
            System.out.println(currentComputer.toString());
        }
    }
}

