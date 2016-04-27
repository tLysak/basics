package com.brainacad.lpyavka.lesson4;

public class Laboratory3 {
    public static void main(String[] args) {
        for (int i = -1; i <= 9; i++) {
            switch (i) {
                case -1:
                    System.out.printf("\n* |");
                    break;
                case 0:
                    System.out.printf("-------------");
                    break;
                default:
                    System.out.print(i + " |");
                    break;
            }
            for (int j = 1; j <= 9; j++) {
                if (i == -1) {
                    System.out.printf("%4d", j);
                } else if (i == 0) {
                    System.out.printf("---");
                } else if (i > 0 && i <= 9) {
                    System.out.printf("%4d", j * i);
                }
            }
            System.out.println("");
        }
    }
}
