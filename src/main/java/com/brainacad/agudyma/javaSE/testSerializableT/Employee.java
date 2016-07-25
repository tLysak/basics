package com.brainacad.agudyma.javaSE.testSerializableT;

import java.io.Serializable;

/**
 * Created by Sidhartha on 17.07.2016.
 */
public class Employee implements Serializable{
    private String name;
    private String adress;
    private transient int  SSN;
    private int number;

    public Employee(String name, String adress , int SSN, int number) {
        this.name = name;
        this.adress = adress;
        this.SSN = SSN;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getSSN() {
        return SSN;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString(){
        return getClass() + " "+ getName()+" "+getAdress()+ " " +getSSN()+" "+getNumber();
    }
}
