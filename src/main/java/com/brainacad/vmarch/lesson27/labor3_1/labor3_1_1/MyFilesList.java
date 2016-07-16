package com.brainacad.vmarch.lesson27.labor3_1.labor3_1_1;

import java.io.File;
import java.util.Scanner;

public class MyFilesList {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passToFiles = scanner.nextLine();

        File stre = new File(passToFiles);
        File[] irr = stre.listFiles();
        for (int i = 0; i < irr.length; i++) {
            File b = irr[i];
            System.out.println(b);
        }
    }
}
