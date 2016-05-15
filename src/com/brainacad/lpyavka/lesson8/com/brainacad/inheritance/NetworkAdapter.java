package com.brainacad.lpyavka.lesson8.com.brainacad.inheritance;

public class NetworkAdapter extends Device {
    private long speed = 200L;

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(final long speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Network adapter: " +
                "speed= " + speed +
                ". " + super.toString();
    }
}
