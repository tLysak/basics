package com.brainacad.lpyavka.lesson9;

public class Device {
    private static long nextSerialNumber = 0;

    private double price;
    private long serialNumber;
    private String manufacturer;

    static {
        System.out.println("We are in a static block, parent, device");
    }
    {
        System.out.println("We are in non static block, parent, device");
    }

    public Device() {
        System.out.println("We are in device, parent, constructor");
    }

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

    @Override
    public String toString() {
        return "Device{" +
                "price=" + price +
                ", serialNumber=" + serialNumber +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;

        Device device = (Device) o;

        if (Double.compare(device.price, price) != 0) return false;
        if (serialNumber != device.serialNumber) return false;
        if (!manufacturer.equals(device.manufacturer)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (serialNumber ^ (serialNumber >>> 32));
        result = 31 * result + manufacturer.hashCode();
        return result;
    }
}

