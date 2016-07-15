package com.brainacad.onesterenko.Lesson8.Inheritance;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 * Created by User on 13.05.2016.
 */
public class Device {

    public Device(float price, String serialNumber, String manufacturer) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
    }

    private float price;
    private String serialNumber;
    private String manufacturer;

    Device () {

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString(){
        String data = "manufacturer=" + manufacturer +", price=" + price + ", s/n=" + serialNumber;
        return data;
    }


}
