package com.brainacad.agudyma.op;

import java.util.Random;

/**
 * Created by User on 29.04.2016.
 */
public class Entrypoint {
    private static final int RANGE = 99999;
    public static void main (String[]args) {
        Computer[] computers= new Computer[]{new Computer(), new Computer(), new Computer(), new Computer(), new Computer()
        };
        Random random = new Random();
        for(Computer currentComputer : computers) {
            currentComputer.setSerialNumber(random.nextInt());
        }
        for (Computer currentComputer : computers){
            float currentPrice = currentComputer.getPrice();
            currentComputer.setPrice(currentPrice*1.1f);

        }
        for(Computer currentComputer : computers){
            currentComputer.printStateToConsole();
        }
    }
}
