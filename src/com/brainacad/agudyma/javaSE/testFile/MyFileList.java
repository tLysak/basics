package com.brainacad.agudyma.javaSE.testFile;



import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by User on 13/07/2016.
 */
public class MyFileList {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        scanner.close();
        File file = new File("C:\\Users\\Sidhartha\\IdeaProjects\\basics\\userInput.text");
        file.createNewFile();
        File[] fileList = file.listFiles();
        System.out.println(Arrays.toString(fileList));
        System.out.println(file.exists());


        System.out.println(file.getAbsolutePath());
        System.out.println(file.isDirectory());






    }
}
