package com.brainacad.onesterenko.Lesson8.Inheritance;

/**
 * Created by User on 13.05.2016.
 */
public class Device {
    private double price;
    private long serialNumber;
    private String manufacturer;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
