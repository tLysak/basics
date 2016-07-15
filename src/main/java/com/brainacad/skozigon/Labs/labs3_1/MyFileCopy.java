package com.brainacad.skozigon.Labs.labs3_1;

import java.io.*;

/**
 * Created by skozigon on 13.07.2016.
 */
public class MyFileCopy {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        BufferedInputStream b_inputStream = null;
        BufferedOutputStream b_outputStream = null;

        String path_in = args[0];
        String path_out = args[1];
        long time1, time2;

        try {
            inputStream = new FileInputStream(new File(path_in));
            outputStream = new FileOutputStream(new File(path_out));
            int i;
            time1 = System.currentTimeMillis();
            while((i = inputStream.read())!= -1){
                outputStream.write(i);
            }
            time2 = System.currentTimeMillis();
            System.out.println(time2 - time1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            b_inputStream = new BufferedInputStream(new FileInputStream(path_in));
            b_outputStream = new BufferedOutputStream(new FileOutputStream(path_out));
            int i;
            time1 = System.currentTimeMillis();
            while((i = b_inputStream.read())!= -1){
                b_outputStream.write(i);
            }
            time2 = System.currentTimeMillis();
            System.out.println(time2 - time1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
