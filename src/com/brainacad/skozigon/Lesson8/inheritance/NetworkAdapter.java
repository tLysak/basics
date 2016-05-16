package com.brainacad.skozigon.Lesson8.inheritance;

/**
 * Created by skozigon on 13.05.2016.
 */
public class NetworkAdapter extends Device{
    private long speed = 1000;

    public void setSpeed(long speed) {
        this.speed = speed;
    }

    public long getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "Network adapter: \n" + "speed: " +speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass()!= obj.getClass())
            return false;

        return true;
    }
}
