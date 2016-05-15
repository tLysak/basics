package com.brainacad.tlysak.oop.lesson8.inheritance;

public class Device {
    private static long nextSerialNumber = 0;

    private double price;
    private long serialNumber;
    private String manufacturer;
    
    public static long getSerialNumberForNewDevice() {
        return nextSerialNumber++;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(final double price) {
        this.price = price;
    }

}
