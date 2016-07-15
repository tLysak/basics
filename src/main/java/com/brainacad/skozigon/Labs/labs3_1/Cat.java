package com.brainacad.skozigon.Labs.labs3_1;

import java.io.*;

/**
 * Created by skozigon on 13.07.2016.
 */
public class Cat {
    public static void main(String[] args) {
        BufferedReader inputStream = null;
        String path = args[0];
        try {
            inputStream = new BufferedReader(new FileReader(new File(path)));
            String stringRader=null;
            while ((stringRader = inputStream.readLine())!=null){
                System.out.println(stringRader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
