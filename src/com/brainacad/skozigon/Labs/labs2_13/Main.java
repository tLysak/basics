package com.brainacad.skozigon.Labs.labs2_13;

import java.util.Scanner;

/**
 * Created by skozigon on 03.06.2016.
 */
enum MyDayOfWeek {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    public String nextDay(String string) {
        MyDayOfWeek[] d = MyDayOfWeek.values();
        MyDayOfWeek code = this;
        int i = code.ordinal();
            i++;
        return d[i].toString();
    }

}

public class Main {
    public static void main(String[] args) {

        for (MyDayOfWeek day : MyDayOfWeek.values()) {
            System.out.println(day);
        }

        for (MyDayOfWeek day : MyDayOfWeek.values()) {

            switch (day) {
                case MONDAY:
                    System.out.println("My Java day is: " + day.name());
                    break;
                case WEDNESDAY:
                    System.out.println("My Java day is: " + day.name());
                    break;
                case FRIDAY:
                    System.out.println("My Java day is: " + day.name());
                    break;
            }
        }
        System.out.println("Enter day:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().toUpperCase();
        System.out.println(MyDayOfWeek.valueOf(line).nextDay(line));
    }
}





