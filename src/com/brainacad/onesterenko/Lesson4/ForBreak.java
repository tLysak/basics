package com.brainacad.onesterenko.Lesson4;

/**
 * .Вивести в консоль 10 перших чисел з діапазону від 1 до 300,
 * які одночасно діляться націло на 3 і 4
 * (використовуючи цикл for і break для виходу з циклу)
 */
public class ForBreak {


    public static void main(String[] args) {
        int num=1;
        for (int i=1; i <=300; i++ ){
            if ( i%3 == 0 && i%4 ==0 ){
                System.out.println(i);
                num++;
            }

            if (num >10) {
                break ;
            }
} } }