package com.brainacad.agudyma.testNumberFormat;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by User on 04/07/2016.
 */
public class TestNumberFormat {

    public static void main(String[] args) {
        long number = 25_000_000;


        NumberFormat numFmt = NumberFormat.getInstance();
        System.out.println("@Default " + numFmt.format(number) );
        NumberFormat numItl = NumberFormat.getCurrencyInstance();
        System.out.println("It " + numItl.format(number));
        Locale locUkr = new Locale("us","US");
        NumberFormat curUkr = NumberFormat.getCurrencyInstance(locUkr);
        System.out.println(curUkr.format(number));
        Date date = new Date();
        System.out.println(date);
        System.out.println();

        Calendar mnt = Calendar.getInstance();
        int day = mnt.get(Calendar.DATE);
        int month = mnt.get(Calendar.MONTH)+1;
        int year = mnt.get(Calendar.YEAR);
        String dateStr = day + "." + month + "." + year;
        System.out.println(dateStr);

        Runtime run = Runtime.getRuntime();
        System.out.println("freememory:" + run.freeMemory());

        int [] x = new int[20000000];
        System.out.println("freememory:" + run.freeMemory());



    }
}
