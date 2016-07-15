package com.brainacad.onesterenko.lab3_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by User on 15/07/2016.
 */
public class SerializeDemo {
    public static void main(String[] args) throws IOException {

        Employee employee = new Employee("Omelian Piddubgolovachenko","Prospect Stepana Banderu 15a",12,78500);
        FileOutputStream fos = null;
        ObjectOutputStream objectOutputStream;

        try {
            fos = new FileOutputStream("C:\\test\\sertest.ser");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(employee);


            objectOutputStream.close();

        }

    }

