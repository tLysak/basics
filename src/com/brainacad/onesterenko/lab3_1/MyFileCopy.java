package com.brainacad.onesterenko.lab3_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static java.lang.System.out;

/**
 * Created by alexkaniv on 13/07/2016.
 */
public class MyFileCopy {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            inputStream = new FileInputStream("C://Users/txt.txt");
            outputStream = new FileOutputStream("C://Users/txtout.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        }


    }

