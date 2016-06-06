package com.brainacad.vmarch.lesson9.inheritance;


public class Monitor extends Device {

    private int resolutionX;
    private int resolutionY;

    public Monitor(int resolutionX, int resolutionY) {

        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }


    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor:  resolution X:" + resolutionX + ", resolutionY:" + resolutionY;
    }
}
