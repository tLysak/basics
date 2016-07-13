package com.brainacad.onesterenko.lab3_1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by alexkaniv on 13/07/2016.
 */
 class Cat {
    public static void main(String[] args) {
        BufferedReader fileReader = null;
      //  Scanner scanner = new Scanner(System.in);
        //String userInput = scanner.nextLine();
        //scanner.close();

         try {
             fileReader = new BufferedReader (new FileReader("C:\\test\\test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
         while(true){
             String temp = fileReader.readLine();
           System.out.println(temp);
              if (temp == null){return;}
        }} catch (IOException e) {
            e.printStackTrace();
        }



    }
}
