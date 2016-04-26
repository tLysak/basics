package com.brainacad.skozigon.Lesson4;


import java.util.Scanner;

public class Lesson4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i<3) System.out.println("Number < 3");
        else
            if(i>10) System.out.println("Number so much");
        else System.out.println("Number > 3");
    }
}
