package com.brainacad.tlysak.oop;

/**
 * Created by tymur on 4/29/16.
 */
public class Computer {
    private String manufecturer;
    private int serialNumber;
    private float price = 120.00f;
    private int quantityCPU;
    private int frequencyCPU;

    public String getManufecturer() {
        return manufecturer;
    }

    public void setManufecturer(String manufecturer) {
        this.manufecturer = manufecturer;
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

    public void printStateToConsole() {
        System.out.println("Computer serialId= " + this.serialNumber
                + "price = " + this.price);
    }
}
