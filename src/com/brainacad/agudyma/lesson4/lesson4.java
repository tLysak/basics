package com.brainacad.agudyma.lesson4;

import static com.brainacad.tlysak.oop.Person.count;

/**
 * Created by User on 27.04.2016.
 */
public class lesson4 {
    public static void main (String[]args){
        System.out.println(" | 1 2 3 4 5 6 7 8 9");
        System.out.println("-------------------------");
        int a = 1;
        int multiplier = 1;
        int column = 1;
        do {System.out.println(column + "| "+ multiplier*(a)+" "+ multiplier*(a+1)+" "+ multiplier*(a+2)+" "+ multiplier*(a+3)+" "+ multiplier*(a+4)+" "+ multiplier*(a+5)+" "+ multiplier*(a+6)+" "+ multiplier*(a+7) +" "+ multiplier*(a+8));column++;multiplier++;}
        while (column < 10);

    }
}
