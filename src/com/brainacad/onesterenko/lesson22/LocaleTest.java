package com.brainacad.onesterenko.lesson22;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by User on 04/07/2016.
 */
public class LocaleTest {
    public static void main(String[] args) {

        long number = 25_000_000L;
        NumberFormat numFmt = NumberFormat.getCurrencyInstance();
        System.out.println("Default "+numFmt.format(number));
        NumberFormat numItl = NumberFormat.getCurrencyInstance(Locale.ITALY);
        System.out.println("ITALY " + numItl.format(number));
        NumberFormat numChn = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println("China "+numChn.format(number));
        Locale loc = new Locale ("fr","FR");
        NumberFormat curFr=NumberFormat.getCurrencyInstance(loc);
        System.out.println("Fr "+curFr.format(number));
    }

}
