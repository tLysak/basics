package com.brainacad.skozigon.Labs.labs3_2;

import java.io.*;

/**
 * Created by skozigon on 15.07.2016.
 */
public class DeserializeDemo implements Serializable{

    public DeserializeDemo(Employee employee) throws FileNotFoundException {
        FileInputStream fileInputStream1 = new FileInputStream("d:\\employee.ser");

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream1);
            employee = (Employee)objectInputStream.readObject();
            System.out.println(employee.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            fileInputStream1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public DeserializeDemo(Manager manager) throws FileNotFoundException {
        FileInputStream fileInputStream1 = new FileInputStream("d:\\manager.ser");

        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream1);
            manager = (Manager) objectInputStream.readObject();
            System.out.println(manager.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            fileInputStream1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
