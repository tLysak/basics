package com.brainacad.onesterenko;

import java.util.Scanner;

/**
 * Created by alexkaniv on 22/04/2016.
 */
public class lesson2 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first line here");
        String firstln = scan.nextLine();
        System.out.println("Enter your second line here");
        String secondln = scan.nextLine();
        System.out.println( firstln + " " + secondln);
    }

}
