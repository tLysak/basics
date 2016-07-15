package com.brainacad.skozigon.Labs.labs3_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by skozigon on 15.07.2016.
 */
public class SerializeDemo {
    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", "Khreschatyk, 48", 258741, 0442554466);
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("d:\\employee.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            new DeserializeDemo(employee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
