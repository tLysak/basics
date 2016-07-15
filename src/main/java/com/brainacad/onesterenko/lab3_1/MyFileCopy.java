package com.brainacad.onesterenko.lab3_1;

import java.io.*;

import static java.lang.System.out;

/**
 * Created by alexkaniv on 13/07/2016. час system.currenttime
 */
public class MyFileCopy {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

         // FileInputStream inputStream = null;
        //FileOutputStream outputStream = null;
        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;


        try {
            inputStream = new BufferedInputStream( new FileInputStream("C:\\test\\test.txt"));
            outputStream = new BufferedOutputStream( new FileOutputStream("C:\\test\\testout.txt"));
            int c;
            while ((c= inputStream.read())!=-1){
                outputStream.write(c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis()-startTime);
    }



    }

