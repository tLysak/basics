package com.brainacad.skozigon.Lesson4;


public class Lesson4_4 {
    public static void main(String[] args) {
        int i , j;
            for (j=1 ,i=1; j < 300 & i<=10 ; j++) {
                if (((j % 3) == 0) && ((j % 4) == 0)) {
                    System.out.println("The number " + i + ", which divide by three and four is: " + j);
                    i++;
                }

            }

    }
}
