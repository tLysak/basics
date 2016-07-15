package com.brainacad.skozigon.lesson24;

import java.util.Calendar;

/**
 * Created by skozigon on 04.07.2016.
 */
public class Calend {
    public static void main(String[] args) {
        Calendar mcl = Calendar.getInstance();
        int day = mcl.get(Calendar.DATE);
        int month = mcl.get(Calendar.MONTH) + 1;
        int year = mcl.get(Calendar.YEAR);
        String dateStr = day + "." + month + "." + year;
        System.out.println(dateStr);
    }
}
