package com.brainacad.vmarch.lesson9.inheritance;


public class MainDevice {
    public static void main(String[] args) {

        Device device = new Device("SANSUNC", 1500.6f, "U9200MEQW");
        Monitor monitor = new Monitor(1280, 800);
        EthernetAdapter ethernetAdapter = new EthernetAdapter(1200, "Der1121222");

        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);
    }
}
