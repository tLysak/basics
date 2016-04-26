package com.brainacad.akuziakov.Lesson4;

public class Lesson4_3 {
    public static void main(String[] args) {

        String printValue;

        for (int i = 0; i < 11; i++) {
            switch (i) {
                case 0:
                    printValue = "*|\t";
                    break;
                case 1:
                    printValue = "";
                    break;
                default:
                    printValue = i - 1 + "|\t";
                    break;
            }
            System.out.print(printValue);

            for (int j = 1; j < 10; j++) {
                switch (i){
                    case 0:
                        printValue=j + "\t";
                        break;
                    case 1:
                        printValue = "____";
                        break;
                    default:
                        printValue = (i - 1) * j + "\t";
                        break;
                }
                System.out.println(printValue);
            }
            System.out.println();
        }
    }
}
