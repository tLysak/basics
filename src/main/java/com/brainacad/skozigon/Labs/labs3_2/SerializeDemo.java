package com.brainacad.skozigon.Labs.labs3_2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by skozigon on 15.07.2016.
 */
public class SerializeDemo {

    public static final String EMPLOYEE_SERIALISATION_FILE = "d:\\employee.ser";

    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", "Khreschatyk, 48", 258741, 0442554466);
        Employee employee1 = new Employee("Petro", "Khreschatyk, 47", 2585367, 0442225577);
        Employee employee2 = new Employee("Sydir", "Khreschatyk, 46", 558787, 0442112233);
        Employee employee3 = new Employee("Opanas", "Khreschatyk, 45", 668877, 0443225417);
        Employee employee4 = new Employee("Ohrim", "Khreschatyk, 44", 8825741, 0441556651);

        Manager manager = new Manager("Abdula-Tursun-Zade","Khreschatyk, 40", 658745, 0441112233, 20000 ,Spesialization.Project);

        manager.listEmployee.add(employee1);
        manager.listEmployee.add(employee2);
        manager.listEmployee.add(employee3);
        manager.listEmployee.add(employee4);


        try (FileOutputStream fileOutputStream = new FileOutputStream(EMPLOYEE_SERIALISATION_FILE);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {

//            objectOutputStream.writeObject(employee);
            Employee deserialisedEmployee = new Deserializator().getEmployee(EMPLOYEE_SERIALISATION_FILE);

            System.out.println(deserialisedEmployee);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




//
//        try {
//            fileOutputStream = new FileOutputStream("d:\\manager.ser");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        ObjectOutputStream objectOutputStream = null;
//        try {
//            objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(manager);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            fileOutputStream.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            new Deserializator(manager);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }



    }

}
