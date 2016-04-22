package com.brainacad.akuziakov;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        final Scanner scanner=new Scanner(System.in);
        final StringBuilder stringBuilder=new StringBuilder();

        //reading from console 2 lines and storing them to stringBuilder
        stringBuilder.append(scanner.nextLine());
        stringBuilder.append(scanner.nextLine());

        //Printing stringBuilder content in one line
        System.out.println(stringBuilder.toString());
    }
}
