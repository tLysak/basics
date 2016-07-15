package com.brainacad.skozigon.Labs.labs3_2;

import java.io.*;

/**
 * Created by skozigon on 15.07.2016.
 */
public class DeserializeDemo implements Serializable{

    public DeserializeDemo(Employee employee) throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("d:\\employee.ser");
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            employee = (Employee)objectInputStream.readObject();
            System.out.println(employee.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
