package com.brainacad.onesterenko.Lesson4;

import java.util.Scanner;

/** TASK!
 * Зчитати з консолі ціле число n.  Порахувати суму всіх чисел та середнє значення чисел в
 * діапазоні 1 .. n,
 */
public class OneToNSum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a digit");

        int n = scan.nextInt();
        int average = 0;
        int sum = 0;
        for (int i=1;i<=n; i++){
            sum +=i;
            average = i;
        }
        average = sum/average;

        System.out.println("sum is " + sum);
        System.out.println("average is " + average);
    }
}
