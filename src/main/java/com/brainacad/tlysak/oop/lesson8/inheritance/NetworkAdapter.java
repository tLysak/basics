package com.brainacad.tlysak.oop.lesson8.inheritance;

import com.brainacad.tlysak.oop.lesson8.inheritance.test.Device;

public class NetworkAdapter extends Device {
    private long speed;

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(final long speed) {
        this.speed = speed;
    }

}
