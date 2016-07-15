package com.brainacad.akuziakov.Lesson8_Jars.Lab2;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer();
        NetworkAdapter networkAdapter = new NetworkAdapter();

        computer.setPrice(5000.0);
        computer.setFrequency(2400);
        computer.setMemory(8);
        computer.setManufacturer("IBM");
        computer.setSerialNumber(1234567890);

        networkAdapter.setPrice(200);
        networkAdapter.setSerialNumber(987654321);
        networkAdapter.setManufacturer("Xerox");
        networkAdapter.setSpeed(1000);

        System.out.println(computer.toString());
        System.out.println(networkAdapter.toString());
    }
}
