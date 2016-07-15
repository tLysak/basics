package com.brainacad.vmarch.lesson4;

public class Num10Of300 {
    public static void main(String[] args) {

        System.out.println("10 numbers of the range from 1 to 300\n");

        for (int x = 1, y = 1; x <= 300 && y < 10; x++) {
            if (x % 3 == 0 && x % 4 == 0) {
                System.out.println(x);
                y++;
            }
        }
        System.out.print("\nStop");
    }
}