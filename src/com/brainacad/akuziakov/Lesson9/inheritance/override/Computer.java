package com.brainacad.akuziakov.Lesson9.inheritance.override;

public class Computer extends Device {

    private final String manufacturer;
    private final int serialNumber;
    private float price;
    private final int quantityCPU;

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public float getPrice() {
        return price;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    private final int frequencyCPU;

    public Computer(){
        this("IBM", 1, 1000, 2, 2100);
    }

    public Computer(final String manufacturer, final int serialNumber, final float price, final int quantityCPU, final int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.price = price;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return String.format("Manufacturer: \t%s\nSerial number: \t%d\nPrice: \t%f\nQuantity CPU: \t%d\nFrequency CPU: \t%d\n",
                getManufacturer(), getSerialNumber(), getPrice(), getQuantityCPU(), getFrequencyCPU());
    }

    public void setPrice(float price) {
        this.price = price;
    }

    void view() {
        System.out.printf("Manufacturer: %s, Serial number: %d, Price: %f, Quantity CPU: %d, Frequency CPU: %d\n",
                getManufacturer(), getSerialNumber(), getPrice(), getQuantityCPU(), getFrequencyCPU());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this)return true;
        if (null==obj||getClass()!=obj.getClass())return false;
        Computer computer= ((Computer) obj);
        if (serialNumber!=computer.serialNumber)return false;
        return true;
    }
}
