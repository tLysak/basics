package com.brainacad.skozigon.Lesson5.oop;

public class Computer {

        private String manufacturer;
        private long serialNumber;
        private float price;
        private int quantityCPU;
        private int frequencyCPU;

    public String getManufacturer() {
        return manufacturer;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }
}
