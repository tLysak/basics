package com.brainacad.lpyavka.lesson9;

public class NetworkAdapter extends Device {
    private long speed;

    static {
        System.out.println("We are in a static block, child, networkAdapter");
    }

    {
        System.out.println("We are in non static block, child, networkAdapter");
    }

    public NetworkAdapter() {
        System.out.println("We are in networkDevice, child, constructor");
    }

    public long getSpeed() {
        return speed;
    }

    public void setSpeed(final long speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "NetworkAdapter{" +
                "speed=" + speed +
                "} " + super.toString();
    }
}

