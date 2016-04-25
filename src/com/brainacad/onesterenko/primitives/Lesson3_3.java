package com.brainacad.onesterenko.primitives;

/**
 *  Lesson3_3 Оголосити 2 змінних типу boolean(true and false)
 *  Вивсести в консоль результати операцій logical (AND,OR,NOT,XOR)
 */
public class Lesson3_3 {
    public static void main (String [] args){
        boolean first = true;
        boolean second = false;
        boolean resultAnd = first & second;
        boolean resultOr = first | second;
        boolean resultNotFirst = !first;
        boolean resultNotSecond = !second;
        boolean resultXor = second ^ first;

        System.out.println("AND result is " +resultAnd);
        System.out.println("OR result is " +resultOr);
        System.out.println("NOT first result is " +resultNotFirst);
        System.out.println("Not second result is " +resultNotSecond);
        System.out.println("XOR result is " +resultXor);



    }
}
