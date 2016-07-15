package com.brainacad.vmarch.lesson27.labor3_1;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class NewRand {
    public static void main(String[] args) {


        try (RandomAccessFile raf = new RandomAccessFile("C:\\Users\\User\\Desktop\\tst\\anytext.txt", "rw")) {
            raf.write(new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
            raf.seek(5);
            raf.write(new byte[]{66, 77, 88});
            raf.seek(0);
            byte[] buf = new byte[10];
            int n = raf.read(buf, 0, 10);
            System.out.println(Arrays.toString(buf));

        } catch (IOException e) {

        }
    }
}
