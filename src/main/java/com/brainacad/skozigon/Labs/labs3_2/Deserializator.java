package com.brainacad.skozigon.Labs.labs3_2;

import java.io.*;

/**
 * Created by skozigon on 15.07.2016.
 */
public class Deserializator implements Serializable{

    public Deserializator() {

    }

    public Deserializator(Employee employee) throws FileNotFoundException {

    }

    public Deserializator(Manager manager) throws FileNotFoundException {
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

    public Employee getEmployee(String employeeSerialisationFile) throws FileNotFoundException {

        Employee result = null;

        try (FileInputStream fileInputStream1 = new FileInputStream(employeeSerialisationFile);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream1);) {

            result = (Employee)objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return result;
    }
}
