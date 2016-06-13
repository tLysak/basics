package com.brainacad.vmarch.lesson8.incheritance;

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

        System.out.println("Device AbstractDevice - s/n:" + device.getSerialNumber() + " price:" + device.getPrice() +
                " manufacturer:" + device.getManufacturer());

        System.out.println("Device Computer - s/n:" + computer.getSerialNumber() + " price:" + computer.getPrice() +
                " manufacturer:" + computer.getManufacturer() + " frequency:" + computer.getFrequency() +
                " memory:" + computer.getMemory());

        System.out.println("Device Network adapter - s/n:" + networkAdapter.getSerialNumber() + " price:"
                + networkAdapter.getPrice() + " manufacturer:" + networkAdapter.getManufacturer() + " speed:"
                + networkAdapter.getSpeed());

        System.out.println(computer.getManufacturer());
        System.out.println(computer);

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
