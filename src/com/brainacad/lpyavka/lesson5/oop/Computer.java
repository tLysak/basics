package com.brainacad.lpyavka.lesson5.oop;

public class Computer {

    private String manufacturer;
    private long serialNumber;
    private float price = 120.00f;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer() {

    }

    public Computer(String manufacturer, long serialNumber, float price, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return "Computer{" + "manufacturer=" + manufacturer +
                ", serialNumber=" + serialNumber + ", price=" + price +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU + '}';
    }

}
