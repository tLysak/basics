package main.java.com.brainacad.agudyma.javaSE.testSerializable;

import java.io.*;

/**
 * Created by Sidhartha on 17.07.2016.
 */
public class Deserialize {

        public static void main(String[] args) {


        Employee memp2 = new Employee("Dima", "Rivne", 11, 11);

            File file = new File("Employee.ser");

            try {

                ObjectOutputStream oin = new ObjectOutputStream(new FileOutputStream(file));
                oin.writeObject(memp2);

            } catch (IOException e) {
                e.printStackTrace();
                
            }
        if(file.exists()){
            try {
                ObjectInputStream ois =new ObjectInputStream(new FileInputStream("Employee.ser"));
                try {
                    Employee emp3 = (Employee)ois.readObject();
                    System.out.println(emp3);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
            



    }
}
