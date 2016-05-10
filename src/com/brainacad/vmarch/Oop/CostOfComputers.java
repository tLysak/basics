package com.brainacad.vmarch.Oop;

import java.util.Random;

public class CostOfComputers {
    public static void main(String[] args) {
        Computer[] computers = new Computer[]{
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer(),
                new Computer()
        };
        Random random = new Random();

        for (Computer curentComputers : computers) {
            curentComputers.setSerialNumber(random.nextInt(99999));
        }

        for (Computer curentComputers : computers) {

            float curentPrice = curentComputers.getPrice();
            curentComputers.setPrice(curentPrice * 1.1f);
        }

        for (Computer curentComputers : computers) {
            curentComputers.ResultForAll();
        }
    }
}

