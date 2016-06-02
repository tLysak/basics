package com.brainacad.onesterenko.Lesson8.Inheritance;

/**
 * Created by user on 23.05.2016.
 */
public class Monitor extends Device{
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

    private int resolutionX;
   private int resolutionY;

    public Monitor(float price, String serialNumber, String manufacturer, int resolutionX, int resolutionY) {
        super(price, serialNumber, manufacturer);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString(){
        String data = "manufacturer=" + getManufacturer() +", price=" + getPrice() + ", s/n=" + getSerialNumber()
                + " X="+ resolutionX + ", Y=" +resolutionX;
        return data;
    }
}
