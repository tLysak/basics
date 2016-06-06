package com.brainacad.vmarch.lesson9.inheritance;

public class Device {

    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device() {    //TODO: "why"
    }

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString() {
        return "Device:  manufacturer:" + manufacturer + ", price:" + price + ", serial number:" + serialNumber;

    }
}
