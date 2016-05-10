package com.brainacad.vmarch.Oop;


public class Computer {
    protected String manufacturer;
    protected long serialNumber;
    protected float price = 200.8f;
    protected int quantityCPU;
    protected int frequencyCPU;


    public static void main(String[] args) {

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

    public void setSerialNumber(long serialNumbe) {
        this.serialNumber = serialNumbe;
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

    public void ResultForAll() {

        System.out.println("Serial Number: " + this.serialNumber + " Price: " + this.price);
    }
}
