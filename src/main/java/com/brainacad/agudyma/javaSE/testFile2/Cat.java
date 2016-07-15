package com.brainacad.agudyma.javaSE.testFile2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 13/07/2016.
 */
public class Cat {
    public static void main(String[] args) throws IOException {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.nextLine();
        BufferedReader input = null;

        String content = null;
        try {
            File file = new File("C:\\Users\\User\\Desktop\\Cat.text");
            file.createNewFile();
            if (file.exists()){
            System.out.println(file.getName() + " file created");

//            FileWriter writer = new FileWriter(new File("C:\\Users\\Sidhartha\\IdeaProjects\\basics\\src\\com\\brainacad\\agudyma\\javaSE\\Cat2.txt"));
//            writer.write("This is the File class");
            }

//            content = new Scanner(new File("C:\\Users\\Sidhartha\\Desktop\\Temnyy\\java\\Cat1.txt")).useDelimiter("\\Z").next();
//            System.out.println(content);

            input = new BufferedReader(new FileReader(file));


                String strLine;

                while ((strLine = input.readLine()) != null) {

                    System.out.println(strLine);
                }



        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                input.close();
            }


        }
    }
}
