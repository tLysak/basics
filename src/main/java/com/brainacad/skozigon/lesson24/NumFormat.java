package com.brainacad.skozigon.lesson24;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by skozigon on 04.07.2016.
 */
public class NumFormat {
    public static void main(String[] args) {
        long number = 25000000l;
        NumberFormat numberFormat= NumberFormat.getCurrencyInstance();
        System.out.println("Default: " + numberFormat.format(number));
        NumberFormat numberFormatItl = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("ITALY: " + numberFormatItl.format(number));
        NumberFormat numberFormatChi = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("CHINA: " + numberFormatChi.format(number));
        Locale loc = new Locale("fr", "FR");
        NumberFormat curFr = NumberFormat.getCurrencyInstance(loc);
        System.out.println("FR: " + curFr.format(number));
    }
}
