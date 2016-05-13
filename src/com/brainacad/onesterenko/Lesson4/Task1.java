package com.brainacad.onesterenko.Lesson4;

/**
 * Write a program to produce on console the following :

 1
 2  1
 3 2  1
 4 3 2  1
 5 4 3 2  1
 6 5 4 3 2  1
 7 6 5 4 3 2  1
 8 7 6 5 4 3 2  1


 */
public class Task1 {
    public static void main(String[] args) {
        for (int row =1; row<=8; row++){
               for(int line=row; line>=1; line--){
                System.out.print("a "+ line);
               }
            System.out.println("b");
    }
}}
