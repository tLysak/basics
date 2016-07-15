package com.brainacad.akuziakov.lesson16.testenum1;

import java.time.DayOfWeek;

public class Main {

    enum MyDayOfWeek {
         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
        private MyDayOfWeek nextDay;

        static DayOfWeek[] days = new DayOfWeek[MyDayOfWeek.values().length];

        public MyDayOfWeek nextDay() {
            //days[this    ]
            for (int i = 0; i < MyDayOfWeek.values().length; i++) {
                if (this.name() == MyDayOfWeek.values()[i].name()) {

                    nextDay =
                            (MyDayOfWeek.values().length - 1 == i) ?
                                    MyDayOfWeek.valueOf(MyDayOfWeek.values()[0].name()) :
                                    MyDayOfWeek.valueOf(MyDayOfWeek.values()[i + 1].name());
                    break;
                }
            }
            return nextDay;
        }
    }

    public static void main(String[] args) {

        for (MyDayOfWeek dayOfWeek : MyDayOfWeek.values()) {
            System.out.println(dayOfWeek.toString());
        }

        System.out.println();

        for (MyDayOfWeek dayOfWeek :
                MyDayOfWeek.values()) {

            switch (dayOfWeek) {
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java Day" + dayOfWeek.toString());
                    break;
                default:
                    break;
            }
        }

        System.out.println("\n" + MyDayOfWeek.SATURDAY.nextDay());
    }
}
