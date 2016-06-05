package com.brainacad.agudyma.testEnam1;

import java.util.Arrays;

/**
 * Created by User on 03.06.2016.
 */
public class Main {
    public int i;
    public int dayNumber;
    public enum MyDayOfWeek{
        SUNDAY, MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
    }
    private static String nextDay() {


        MyDayOfWeek[] daysOfWeek = MyDayOfWeek.values();

        String nextDay = null;
        for (int i = 0; i <= 6; i++) {
            if (i == 6 ){
                nextDay= String.valueOf(0);
            }
            else nextDay = String.valueOf(daysOfWeek[i+1]);

        }


        return nextDay;
    }

    public static void main(String[] args) {

        System.out.println(nextDay());
//        for (MyDayOfWeek day : MyDayOfWeek.values()){
////            System.out.println(day);
//                switch (day) {
//                    case SUNDAY:
//                    System.out.println("Sunday");
//                        break;
//                    case MONDAY:
//                        System.out.println("Monday");
//                        break;
//                    case TUESDAY:
//                        System.out.println("Tuesday");

                }
        }





