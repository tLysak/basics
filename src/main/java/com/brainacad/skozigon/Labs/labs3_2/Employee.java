package com.brainacad.skozigon.Labs.labs3_2;

import java.io.Serializable;

/**
 * Created by skozigon on 15.07.2016.
 */
public class Employee implements Serializable{
    private String name;
    private String address;
    private int SNN;
    private int number;

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
        return super.toString();
    }
}
