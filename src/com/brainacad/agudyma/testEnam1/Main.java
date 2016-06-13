package com.brainacad.agudyma.testEnam1;

/**
 * Created by User on 03.06.2016.
 */
public class Main {
    public int i;

    public enum MyDayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    private static String nextDay() {


        for (MyDayOfWeek day : MyDayOfWeek.values()) {
//            System.out.println(day);
            switch (day) {
                case SUNDAY:
                    System.out.println(MyDayOfWeek.MONDAY);
                    break;
                case MONDAY:
                    System.out.println(MyDayOfWeek.TUESDAY);
                    break;
                case TUESDAY:
                    System.out.println(MyDayOfWeek.WEDNESDAY);
                    break;
                case WEDNESDAY:
                    System.out.println(MyDayOfWeek.THURSDAY);
                    break;
                case THURSDAY:
                    System.out.println(MyDayOfWeek.FRIDAY);
                    break;
                case FRIDAY:
                    System.out.println(MyDayOfWeek.SATURDAY);
                    break;
                case SATURDAY:
                    System.out.println(MyDayOfWeek.SUNDAY);
                    break;
            }
        }
        return " ";
    }
//
//        MyDayOfWeek[] daysOfWeek = MyDayOfWeek.values();
//
//        for (int dayNumber  = 0 ; dayNumber < 6; dayNumber++) {
//            MyDayOfWeek nextDay1 = daysOfWeek[dayNumber+1];
////
//            System.out.println(nextDay1);
//        }
//             return MyDayOfWeek.SUNDAY;
//
//
//    }


    public static void main(String[] args) {

        System.out.println(nextDay());


    }
}





