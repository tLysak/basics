package com.brainacad.onesterenko.lab3_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by User on 15/07/2016.
 */
public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee2=null;

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\test\\sertest.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ObjectInputStream oin = null;
        try {
            oin = new ObjectInputStream(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            employee2=(Employee)oin.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                oin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Name: "+employee2.getName());
        System.out.println("Adress "+employee2.getAdress());
        System.out.println("SSN "+ employee2.getSSN());
        System.out.println("Number "+ employee2.getNumber());

    }
}
