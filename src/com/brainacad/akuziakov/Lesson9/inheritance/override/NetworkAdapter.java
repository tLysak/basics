package com.brainacad.akuziakov.Lesson9.inheritance.override;

public class NetworkAdapter extends Device {
    @Override
    public String toString() {
        return String.format("This is %s", this.getClass().getSimpleName());
    }
}
