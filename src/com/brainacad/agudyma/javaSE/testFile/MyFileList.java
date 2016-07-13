package com.brainacad.agudyma.javaSE.testFile;



import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 13/07/2016.
 */
public class MyFileList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        File file = new File(userInput);
        File[] fileList = file.listFiles();
        System.out.println(Arrays.toString(fileList));
        System.out.println(file.exists());


        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());






    }
}
