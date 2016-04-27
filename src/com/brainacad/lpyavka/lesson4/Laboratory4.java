package com.brainacad.lpyavka.lesson4;

public class Laboratory4 {
    public static void main(String[] args) {
        int index = 0;
        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                System.out.println(i);
                index++;
            }
            if (index >= 10) {
                break;
            }
        }
    }
}

