package com.brainacad.lpyavka;

import java.util.Scanner;

/**
 * Created by Sony on 21.04.2016.
 */
public class Lesson2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 1st message:");
        String textFirstLine = scan.nextLine();
        System.out.println("Please enter 2nd message:");
        String textSecondLine = scan.nextLine();

        System.out.print("Your message is: ");
        System.out.println(textFirstLine + " " + textSecondLine);

    }
}
