package com.brainacad.agudyma.javaSE.testSerializableT;

import java.io.*;


/**
 * Created by Sidhartha on 17.07.2016.
 */
public class TestSerializable {

    public static void main(String[] args) throws IOException {
        Employee emp1 = new Employee("Ivan","Kyiv",12,1);
        Employee emp2 = new Employee("Vova","Odessa",2,4);



        FileOutputStream fis = new FileOutputStream("C:\\Users\\User\\Desktop\\employee.ser");
        ObjectOutputStream oin = new ObjectOutputStream(fis);

     try{
         oin.writeObject(emp1);
         oin.close();
     }catch (IOException e){
         e.printStackTrace();
     }
    finally{
        oin.close();
     }
    }

}
