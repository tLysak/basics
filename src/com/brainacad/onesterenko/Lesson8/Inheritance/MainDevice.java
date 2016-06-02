package com.brainacad.onesterenko.Lesson8.Inheritance;

/**
 * Created by user on 23.05.2016.
 */
public class MainDevice {
    public static void main(String[] args) {
        Device someDevice = new Device();
        someDevice = new Device(120,"AB1234567CD","Samsung");
       String data = someDevice.toString();
        System.out.println(data);
        Monitor monitor = new Monitor(320,"GBSOmecrap88","Onda", 1920, 1200);
        System.out.println(monitor.toString());
    }
}
