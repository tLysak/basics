package com.brainacad.onesterenko.lab3_1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by alexkaniv on 13/07/2016.
 */
 class Cat {
    public static void main(String[] args) {
        BufferedReader fileReader = null;
        try {
             fileReader = new BufferedReader (new FileReader("C://Users/txt.txt"));
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
