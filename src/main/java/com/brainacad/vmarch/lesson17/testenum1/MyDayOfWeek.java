package com.brainacad.vmarch.lesson17.testenum1;


public enum MyDayOfWeek {
    MONDAY(0),
    TUESDAY(1),
    WEDNESDAY(2),
    THURSDAY(3),
    FRIDAY(4),
    SATURDAY(5),
    SUNDAY(6);
    int num = 0;

    MyDayOfWeek(int num) {
        if (num < 7) {
            num = num++;
        } else {
            num = 0;
        }
    }
}


