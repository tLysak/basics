package com.brainacad.skozigon.Lesson8.inheritance;



/**
 * Created by skozigon on 13.05.2016.
 */
public class Main {



    public static void main(String[] args) {
        Computer computer1 = new Computer();
        NetworkAdapter networkAdapter1 = new NetworkAdapter();
        Device device1 = new Device();
//        System.out.println("device: \n" + device.getManufacture() + "\n" + device.getPrice() + "\n"
//                + device.getSerialNumber());
        System.out.println(device1.toString());
        System.out.println(computer1.toString());
        System.out.println(networkAdapter1.toString());

        Computer computer2 = new Computer();
        NetworkAdapter networkAdapter2 = new NetworkAdapter();
        Device device2 = new Device();

        device2.setPrice(1200);
        device2.setManufacture("Dell");
        device2.setSerialNumber(258745632154l);
        computer2.setFrequency(45);
        computer2.setMemory(2048);
        networkAdapter2.setSpeed(100);

        System.out.println(String.valueOf(computer1.equals(computer2)));


    }
}
