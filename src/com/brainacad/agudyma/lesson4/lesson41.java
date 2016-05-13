package com.brainacad.agudyma.lesson4;

import java.util.Scanner;

/**
 * Created by Sidhartha on 03.05.2016.
 */
public class lesson41 {
    public static void main(String[] args) {
        System.out.println("Please enter integer number");
        Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            int inputForOut = input;
        System.out.println("Number is " + input);
            int numberLength = (int) (Math.log10(input) + 1);
        System.out.println("Numberlength is " + numberLength);
            int sum = 0;
            int divisionrest = input % (int) Math.pow(10, numberLength-1 );
            int divisionInt = input / (int) Math.pow(10, numberLength-1);
        if (divisionrest > 0) {
            while (input != 0) {
            sum = sum + (input % 10);
                input/=10;
            }
        }
        else System.out.println("Sum of digits of " + inputForOut + " is " + divisionInt);
        System.out.println("Sum of digits of " + inputForOut+ " is " + sum);
        int median = sum/numberLength;
        if (sum % numberLength >= numberLength*0.5){
            int medianplusone = sum/numberLength+1;
            System.out.println("Median of digits is " + medianplusone );
        }
        else         System.out.println("Median of digits is " + median );

    }
}




