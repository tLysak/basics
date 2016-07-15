package com.brainacad.skozigon.lesson26;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by skozigon on 13.07.2016.
 */
public class Main {
    public static void main(String[] args) {


        try(RandomAccessFile raf = new RandomAccessFile("D:\\ra_test.txt", "rw") )
        {

            raf.write(new byte[]{1,2,3,4,5,6,7,8,9});
            raf.seek(5);
            raf.write(new byte[]{22,33,44});
            raf.seek(0);
            byte[] buf = new byte[10];
            int n = raf.read(buf, 0, 10);
            System.out.println(Arrays.toString(buf));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
