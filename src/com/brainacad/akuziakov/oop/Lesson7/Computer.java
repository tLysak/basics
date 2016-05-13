package com.brainacad.akuziakov.oop.Lesson7;

public class Computer {
    private String manufacrute;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufacrute() {
        return manufacrute;
    }

    public void setManufacrute(String manufacrute) {
        this.manufacrute = manufacrute;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
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

    public String getCompterInfo() {
        return "Manufacture";
    }
}
