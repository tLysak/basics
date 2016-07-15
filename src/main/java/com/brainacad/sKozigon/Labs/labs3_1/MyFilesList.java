package com.brainacad.skozigon.Labs.labs3_1;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by skozigon on 13.07.2016.
 */
public class MyFilesList {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        if (string == ""){
            string = "/";
        }

        File file = new File(string);
        String[] files = file.list();
        System.out.println(Arrays.toString(files));


    }
}
