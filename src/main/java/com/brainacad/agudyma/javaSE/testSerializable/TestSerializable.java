package main.java.com.brainacad.agudyma.javaSE.testSerializable;

import java.io.*;


/**
 * Created by Sidhartha on 17.07.2016.
 */
public class TestSerializable {

    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee("Ivan","Kyiv",12,1);
        Employee emp2 = new Employee("Vova","Odessa",2,4);



        FileOutputStream fis = new FileOutputStream("Employee.ser");
        ObjectOutputStream oin = new ObjectOutputStream(fis);

     try{
         oin.writeObject(emp1);
     }catch (IOException e){
         e.printStackTrace();
     }
    finally{
        oin.close();
     }
    }

}
