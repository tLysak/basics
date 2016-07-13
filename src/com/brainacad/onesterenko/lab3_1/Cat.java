package com.brainacad.onesterenko.lab3_1;

import java.io.*;
import java.util.Scanner;

/**
 * Created by alexkaniv on 13/07/2016.
 */
 class Cat {
    public static void main(String[] args) {
        BufferedReader fileReader = null;
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();

         try {
             fileReader = new BufferedReader (new FileReader(userInput));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
           System.out.println(fileReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
