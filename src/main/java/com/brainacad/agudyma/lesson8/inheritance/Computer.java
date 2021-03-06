package com.brainacad.agudyma.lesson8.inheritance;

/**
 * Created by User on 16.05.2016.
 */
public class Computer {
    private String manufacturer;
    private int serialNumber;
    private float price = 120.00f;
    private int quantityCPU;
    private int frequencyCPU;

    @Override
    public int hashCode() {
        int hashCode = (int) (serialNumber ^ (serialNumber >>> 32));
        hashCode = 31 * hashCode + serialNumber;
        return hashCode;
    }
    public Computer(int serialNumber, int quantityCPU)
    {this.serialNumber =serialNumber;
        this.quantityCPU = quantityCPU;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
