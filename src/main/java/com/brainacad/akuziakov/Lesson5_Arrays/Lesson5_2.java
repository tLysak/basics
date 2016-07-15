package com.brainacad.akuziakov.Lesson5_Arrays;

import java.util.Arrays;

public class Lesson5_2 {
    public static void main(String[] args) {

        int[] numbers = {10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 9, 14};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int min = 0;
        int max = 0;
        float average = 0;
        float median = 0;

        min = numbers[0];
        max = numbers[numbers.length - 1];
        int sum = 0;
        for (int number :
                numbers) {
            sum += number;
        }
        average = (float) sum / (float) numbers.length;

        int medianIndex;

        if (0 != numbers.length % 2) {
            median = numbers[numbers.length / 2 + 1];
        } else {
            median = (float) (numbers[numbers.length / 2] + numbers[numbers.length / 2 - 1]) / (float) 2;
        }

        System.out.println("Min= " + min);
        System.out.println("Max=" + max);
        System.out.println("Average=" + average);
        System.out.println("Median=" + median);
    }
}
