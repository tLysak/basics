package com.brainacad.agudyma.javaSE.testRandomAccess;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * Created by Sidhartha on 14.07.2016.
 */
public class RandomAccessFill {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Sidhartha\\Desktop\\Temnyy\\java\\MyFirstLog.txt", "rw");

            raf.write(new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

            raf.seek(5);
            raf.write(new byte[] {66,77,88});
            raf.seek(0);
            byte[] buf = new byte[10];
            int n = raf.read(buf,0,10);
            System.out.println(Arrays.toString(buf));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}