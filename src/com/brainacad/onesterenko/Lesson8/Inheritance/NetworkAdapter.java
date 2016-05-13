package com.brainacad.onesterenko.Lesson8.Inheritance;

/**
 * Created by User on 13.05.2016.
 */
public class NetworkAdapter extends Device {
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int speed;
}
