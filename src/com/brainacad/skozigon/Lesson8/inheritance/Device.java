package com.brainacad.skozigon.Lesson8.inheritance;

/**
 * Created by skozigon on 13.05.2016.
 */
public class Device {
    private double price = 100;
    private long serialNumber = 2547896332547l;
    private String manufacture = "HP";

    public double getPrice() {
        return price;
    }

    public long getSerialNumber()
    {
        return serialNumber;
    }

    public String getManufacture()
    {
        return manufacture;
    }

    public void setPrice(double price) {
        this.price = price;

    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "Device: \n" + "manufacture: " + manufacture + "\nserial number: " + serialNumber + "\nprice: " + price ;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass()!= obj.getClass())
            return false;

        return true;
    }
}
