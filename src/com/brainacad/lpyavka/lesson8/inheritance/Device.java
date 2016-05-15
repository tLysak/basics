package com.brainacad.lpyavka.lesson8.inheritance;

public class Device {
    private double price= 10.0;
    private long serialNumber = 100L;
    private String manufacturer= "China";

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Device: ");
        sb.append("price= ").append(price);
        sb.append(", serial number= ").append(serialNumber);
        sb.append(", manufacturer= '").append(manufacturer).append('\'');
        sb.append('.');
        return sb.toString();
    }
}
