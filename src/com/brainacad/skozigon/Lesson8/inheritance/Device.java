package com.brainacad.skozigon.Lesson8.inheritance;



/**
 * Created by skozigon on 13.05.2016.
 */
public class Device {
    public Device(double price, long serialNumber, String manufacture) {
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacture = manufacture;
        System.out.println("in constructor \n" +"Device: " + "manufacture: " + manufacture + "\nserial number: " + serialNumber + "\nprice: " + price);
    }

    private double price = 100;
    private long serialNumber = 2547896332547l;
    private String manufacture = "HP";

    public Device() {
        System.out.println("in empty constructor");

    }


    public double getPrice() {
        return price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public String getManufacture() {
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
        return "Device: \n" + "manufacture: " + manufacture + "\nserial number: " + serialNumber + "\nprice: " + price;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return true;
        Device device = (Device) obj;
        if ((price != device.price) && (serialNumber != device.getSerialNumber()) && (manufacture != device.manufacture))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (Double.doubleToLongBits(price)+(int)(serialNumber^(serialNumber>>>32)) + manufacture.hashCode());
        return result*31;
    }
}
