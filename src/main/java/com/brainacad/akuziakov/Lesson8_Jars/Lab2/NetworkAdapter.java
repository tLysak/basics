package com.brainacad.akuziakov.Lesson8_Jars.Lab2;

public class NetworkAdapter extends Device {

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(final long speed) {
        this.speed = speed;
    }

    private long speed;

    @Override
    public String toString() {
        return super.toString() + "Speed = " + getSpeed();

    }
}
