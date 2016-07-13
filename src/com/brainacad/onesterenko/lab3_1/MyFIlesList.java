package com.brainacad.onesterenko.lab3_1;

import java.io.File;

/**
 * Created by alexkaniv on 13/07/2016.
 */

class myFilesList {
public static void main (String[] args) {

   File dir = new File("C://Users");
    String name = "";
    File[] files = dir.listFiles();

    for (int i=0; i<files.length;i++ ) {
            if (files[i].isFile()) {
                System.out.println(files[i].getName());

        System.out.println(name);
    }}}}


