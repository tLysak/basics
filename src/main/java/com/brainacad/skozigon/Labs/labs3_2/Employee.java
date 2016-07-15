package com.brainacad.skozigon.Labs.labs3_2;

import java.io.Serializable;

/**
 * Created by skozigon on 15.07.2016.
 */
public class Employee implements Serializable{
    private String name;
    private String address;
    private transient int SNN;
    private int number;

    public Employee(String name, String address, int SNN, int number) {
        this.name = name;
        this.address = address;
        this.SNN = SNN;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSNN() {
        return SNN;
    }

    public void setSNN(int SNN) {
        this.SNN = SNN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Employee name = " + getName() + "\nadress: " + getAddress() + "\nSNN: " + getSNN() + "\nnumber: " + getNumber();

    }
}
