package com.brainacad.onesterenko.primitives;

/**
 * Оголосити і ініціалізувати 2 змінних int - 4, 2 .
 * Вивести в консоль результати операцій &, |, ^ між цими змінними та результат  ~ першої змінної;
 */
public class Lesson3_6 {
    public static void main (String [] args) {

        int firstValue = 4;
        int secondValue = 2;

        int resultAnd = firstValue & secondValue;
        int resultOr = firstValue| secondValue;
        int resultXor = firstValue^secondValue;
        int resultNot = ~firstValue;

        System.out.println("result And = "+ resultAnd);
        System.out.println("result OR = "+ resultOr);
        System.out.println("result XOR = "+ resultXor);
        System.out.println("result NOT = "+ resultNot);
           }
}
