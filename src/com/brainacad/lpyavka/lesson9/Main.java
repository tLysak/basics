package com.brainacad.lpyavka.lesson9;

import java.util.Random;

public class Main {
    private static final int LESS_THEN_THOUSAND = 999;
    private static final String DEFAULT_MANUFACTURER = "Jackie Chan";
    private static final long DEFAULT_ADAPTER_SPEED = 100_000_000;
    private static final int DEFAULT_CPU_FREQUENCY = 1_000_000_000;
    private static final int DEFAULT_MEMORY_CAPACITY = 1024;
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        final Device device = createDevice();
        final Computer computer = createComputer();
        final NetworkAdapter networkAdapter = createNetworkAdapter();

//        System.out.println("Device AbstractDevice - s/n:" + device.getSerialNumber() + " price:" + device.getPrice() +
//                " manufacturer:" + device.getManufacturer());
//
//        System.out.println("Device Computer - s/n:" + computer.getSerialNumber() + " price:" + computer.getPrice() +
//                " manufacturer:" + computer.getManufacturer() + " frequency:" + computer.getFrequency() +
//                " memory:" + computer.getMemory());
//
//        System.out.println("Device Network adapter - s/n:" + networkAdapter.getSerialNumber() + " price:"
//                + networkAdapter.getPrice() + " manufacturer:" + networkAdapter.getManufacturer() + " speed:"
//                + networkAdapter.getSpeed());


        System.out.println(device.toString());
        System.out.println(computer.toString());
        System.out.println(networkAdapter.toString());

        Computer computer1 = createComputer();
        Computer computer2 = createComputer();
        Computer computer3 = new Computer();
        computer3.setMemory(500);
        computer3.setManufacturer("Japan");
        computer3.setPrice(3000);
        Computer computer4 = new Computer();
        computer4.setMemory(500);
        computer4.setManufacturer("Japan");
        computer4.setPrice(3000);
        System.out.println("Does PC1 equal PC2? - " + computer1.equals(computer2));
        System.out.println("Does PC1 = PC2? " + (computer1 == computer2));
        System.out.println("Does PC1 equal PC3? - " + computer1.equals(computer3));
        System.out.println("Does PC1 = PC2? " + (computer1 == computer3));
        System.out.println("PC1 and PC2, Is contract followed? - " + (computer1.equals(computer2) && computer1.hashCode() == computer2.hashCode()));
        System.out.println("PC1 and PC3, Is contract followed? - " + (computer1.equals(computer3) && computer1.hashCode() == computer3.hashCode()));
        System.out.println("Does PC3 equal PC4? - " +computer3.equals(computer4));
        System.out.println("Does PC3 = PC4? " + (computer3 == computer4));
        System.out.println("PC3 and PC4, Is contract followed? - " + (computer3.equals(computer4) && computer3.hashCode() == computer4.hashCode()));
        System.out.println("PC1 hashcode: "+ computer1.hashCode());
        System.out.println("PC2 hashcode: "+ computer2.hashCode());
        System.out.println("PC3 hashcode: "+computer3.hashCode());
        System.out.println("PC4 hashcode: "+computer4.hashCode());
    }

    private static NetworkAdapter createNetworkAdapter() {
        final NetworkAdapter adapter = new NetworkAdapter();
        adapter.setSerialNumber(Device.getSerialNumberForNewDevice());
        adapter.setPrice(RANDOM.nextInt(LESS_THEN_THOUSAND));
        adapter.setManufacturer(DEFAULT_MANUFACTURER);
        adapter.setSpeed(DEFAULT_ADAPTER_SPEED);
        return adapter;
    }

    private static Computer createComputer() {
        final Computer computer = new Computer();
        computer.setSerialNumber(Device.getSerialNumberForNewDevice());
        computer.setPrice(RANDOM.nextInt(LESS_THEN_THOUSAND));
        computer.setManufacturer(DEFAULT_MANUFACTURER);
        computer.setFrequency(DEFAULT_CPU_FREQUENCY);
        computer.setMemory(DEFAULT_MEMORY_CAPACITY);
        return computer;
    }

    private static Device createDevice() {
        final Device abstractDevice = new Device();
        abstractDevice.setSerialNumber(Device.getSerialNumberForNewDevice());
        abstractDevice.setPrice(RANDOM.nextInt(LESS_THEN_THOUSAND));
        abstractDevice.setManufacturer(DEFAULT_MANUFACTURER);
        return abstractDevice;
    }

}

