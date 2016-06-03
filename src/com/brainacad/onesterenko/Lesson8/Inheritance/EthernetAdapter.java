package com.brainacad.onesterenko.Lesson8.Inheritance;

/**
 * Created by user on 23.05.2016.
 */
public class EthernetAdapter extends Device {
    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;
    private String mac;
}
