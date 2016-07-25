package com.brainacad.agudyma.javaSE.testSerializableT;

import java.io.*;

/**
 * Created by Sidhartha on 17.07.2016.
 */
public class Deserialize {

        public static void main(String[] args) {


        Employee memp2 = new Employee("Dima", "Rivne", 11, 11);

            FileOutputStream fileOutputStream = null;

            try {
                fileOutputStream = new FileOutputStream("C:\\Users\\User\\Desktop\\employee.ser");
                ObjectOutputStream oin = new ObjectOutputStream(fileOutputStream);
                oin.writeObject(memp2);
                oin.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


            try {
                ObjectInputStream ois =new ObjectInputStream(new FileInputStream("C:\\Users\\User\\Desktop\\employee.ser"));
                try {
                    Employee emp3 = (Employee)ois.readObject();
                    System.out.println(emp3);
                    ois.close();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
