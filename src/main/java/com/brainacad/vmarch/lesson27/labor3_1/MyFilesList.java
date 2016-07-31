package com.brainacad.vmarch.lesson27.labor3_1;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.in;


public class MyFilesList{

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(in);
        String passToFiles = scanner.nextLine();
        scanner.close();


        try(BufferedWriter writ = new BufferedWriter(new FileWriter("123123.txt", false))){

            writ.write(passToFiles);

            System.out.println("Writen: " + passToFiles);
            writ.flush();
            writ.close();

        }


        try(BufferedReader bufRead = new BufferedReader(new FileReader("123123.txt"))) {

            System.out.println(bufRead.readLine());
            bufRead.close();


        }
    }
}
