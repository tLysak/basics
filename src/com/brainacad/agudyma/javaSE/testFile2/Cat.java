package com.brainacad.agudyma.javaSE.testFile2;

import java.io.*;
import java.util.Scanner;

/**
 * Created by User on 13/07/2016.
 */
public class Cat {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
        BufferedReader input = null;

        try {
//            FileWriter writer = new FileWriter(file);
//            writer.write("This is the File class");
//            File file = new File("C:\\Users\\User\\Desktop\\Cat.text");
//            FileReader input = null;

            input = new BufferedReader(new FileReader ("C:\\Users\\User\\Desktop\\Cat.text"));

            String toConsole = input.readLine();

            System.out.println(toConsole);



        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if( input != null){
                input.close();
            }
        }

    }
}
