package com.brainacad.onesterenko.lab3_1;

import java.io.File;
import java.util.Scanner;

/**
 * Created by alexkaniv on 13/07/2016.
 */

class MyFilesList {
public static void main (String[] args) {

   Scanner scanner = new Scanner(System.in);
  String userInput = scanner.nextLine();
  scanner.close();

   File dir = new File(userInput);

    String name = "";

    File[] files = dir.listFiles();

    for (int i=0; i<files.length;i++ ) {
            if (files[i].isFile()) {
                System.out.println(files[i].getName());

        System.out.println(name);
    }}}}


