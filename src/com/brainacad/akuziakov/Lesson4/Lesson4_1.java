package com.brainacad.akuziakov.Lesson4;

public class Lesson4_1 {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10) {
//            System.out.println(i);
//            i++;
//        }
//        for (int t = 0; t < 10; t++) {
//            System.out.println(t);
//        }
//
//        int month=2;
//        String monthStr;
//        switch (month){
//            case 1:
//                monthStr="January";
//                break;
//            case 2:
//                monthStr="February";
//                break;
//            case 3:
//                monthStr="March";
//                break;
//            default:
//                monthStr="Invalid month";
//                break;
//        }
//        System.out.println(monthStr);
//
//        outer:
//        for (int i=0;i<10;i++){
//            for (int j=0;j<10;j++){
//                if(1==j)
//                    break outer;
//                System.out.println("j="+j);
//            }
//        }

        for (int i = 1; i <= 8; i++) {
            for (int j = i; j >= 1; j--) {
                if (6 == i && 4 == j || 7 == i && 5 == j) {
                    System.out.print("  ");
                    continue;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
