package com.brainacad.agudyma.op;

import java.util.Random;

/**
 * Created by User on 16.05.2016.
 */
public class EntryPoint {
    private static final int RANGE = 9999999;

    public static void main(String[] args) {
        Computer[] computers = new Computer[]{new Computer(),
                new Computer(), new Computer(), new Computer()};

        Random random = new Random();
        for(Computer currentComputer : computers) {
            currentComputer.setSerialNumber(random.nextInt(RANGE));
        }

        for(Computer currentComputer : computers) {
            float currentPrice = currentComputer.getPrice();
            currentComputer.setPrice(currentPrice * 1.1f);
        }

        for(Computer currentComputer : computers) {
            currentComputer.printStateToConsole();
        }


    }
}
