package com.brainacad.onesterenko.lab3_2;

import java.io.Serializable;

/**
 *  String name, String address, int SSN, int number.
 *  Add getters and setters to Employee class.
 *  Override the toString() method. Create SerializeDemo program which
 *  instantiates an Employee object and serializes it to a file.
 */
public class Employee implements Serializable{

    private enum SPECIALISATIONS{};
    private String name;
    private String adress;
    private transient int SSN;
    private int number;

    public Employee() {
    }

    public Employee(String name, String adress, int SSN, int number) {
        this.name = name;
        this.adress = adress;
        this.SSN = SSN;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return getAdress() + getName() + getNumber() +getSSN();
    }
}