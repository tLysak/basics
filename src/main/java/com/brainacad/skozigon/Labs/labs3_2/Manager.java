package com.brainacad.skozigon.Labs.labs3_2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by skozigon on 15.07.2016.
 */
public class Manager extends Employee implements Serializable{
    private final int rate;
    private Spesialization spesialization;
    List<Employee> listEmployee = new ArrayList<>();

    public Manager(String name, String address, int SNN, int number, int rate, Spesialization spesialization) {
        super(name, address, SNN, number);
        this.rate = rate;
        this.spesialization = spesialization;
    }



    public int getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "Employee name = " + getName() + "\nadress: " + getAddress() + "\nSNN: " + getSNN() + "\nnumber: " + getNumber()
                + "\nrate: " + getRate();

    }


    public Spesialization getSpesialization() {
        return spesialization;
    }

    public void setSpesialization(Spesialization spesialization) {
        this.spesialization = spesialization;
    }
}
