package com.brainacad.vmarchenko;

/**
 * Created by User on 21.04.16.
 */

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        System.out.print(s1 + " " + s2);
        sc.close();
    }
}
