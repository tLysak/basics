package com.brainacad.vmarch.Lesson4;

public class Lesson4_4 {
    public static void main(String[] args) {
        int x;
        int y = 1;
        boolean c;
        System.out.println("10 numbers of the range from 1 to 300");
        System.out.println();
        for (x = 1; x <= 300 && y <= 10; x++) {
            if (c = ((x % 3) == 0) && ((x % 4) == 0)) {
                System.out.println(x);
                y++;
            } else if (y == 10) {
                System.out.println();
                System.out.print("Stop");
                break;
            }
        }
    }
}