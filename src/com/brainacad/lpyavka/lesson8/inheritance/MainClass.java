package com.brainacad.lpyavka.lesson8.inheritance;

public class MainClass {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Device device= new Device();
        NetworkAdapter networkAdapter= new NetworkAdapter();
        System.out.println(device.toString());
        System.out.println(computer.toString());
        System.out.println(networkAdapter.toString());
    }
}
