package com.brainacad.vmarch;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1, s2;
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        System.out.print(s1 + " " + s2);
    }
}

