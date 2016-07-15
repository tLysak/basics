package com.brainacad.skozigon.Lesson8.inheritance;


/**
 * Created by skozigon on 13.05.2016.
 */
public class Main {


    public static void main(String[] args) {
        Computer computer1 = new Computer();
        NetworkAdapter networkAdapter1 = new NetworkAdapter();
        Device device1 = new Device(111111, 2654184l, "Asus");

//        System.out.println(device1.toString());
        System.out.println(computer1.toString());
        System.out.println(networkAdapter1.toString());
        System.out.println("------------------------------");


        Device device2 = new Device();
        Computer computer2 = new Computer();
        NetworkAdapter networkAdapter2 = new NetworkAdapter(1500.5, 26546l, "IBM");
        System.out.println(networkAdapter2.getManufacture());



        device2.setPrice(1200);
        device2.setManufacture("Dell");
        device2.setSerialNumber(258745632154l);
        computer2.setFrequency(45);
        computer2.setMemory(2048);
        networkAdapter2.setSpeed(100);

        System.out.println("Computer2 \n" + computer2.toString());

        Computer computer3 = new Computer();
//        NetworkAdapter networkAdapter3 = new NetworkAdapter();
//        Device device3 = new Device();

        System.out.println("computer3 = computer1");

        System.out.println("computer1 equals computer2");
        System.out.println((computer1.equals(computer2)));
        System.out.println("computer1 == computer2");
        System.out.println(computer1 == computer2);

        System.out.println("-----------");
        System.out.println("computer1 == computer3");
        System.out.println(computer3 == computer1);
        System.out.println("computer1 equals computer3");
        System.out.println(computer1.equals(computer3));


        System.out.println("-------------");


        System.out.println(computer1.getManufacture());
        System.out.println(computer2.getManufacture());

        System.out.println("Hash code: ");
        System.out.println("computer1");
        System.out.println(String.valueOf(computer1.hashCode()));
        System.out.println("computer2");
        System.out.println(String.valueOf(computer2.hashCode()));
        System.out.println("hash computer1 == hash computer2  " + (computer1.hashCode() == computer2.hashCode()));

        System.out.println("----------");
        System.out.println("computer1");
        System.out.println(String.valueOf(computer1.hashCode()));
        System.out.println("computer3");
        System.out.println(String.valueOf(computer3.hashCode()));
        System.out.println("hash computer1 == hash computer3   " + (computer1.hashCode() == computer3.hashCode()));



    }
}
