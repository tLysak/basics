package com.brainacad.onesterenko.lesson22;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by User on 04/07/2016.
 */
public class Data {

    public static void main(String[] args) {

    Date date = new Date();
        System.out.println(date);

        Calendar mlc = Calendar.getInstance();
        int day = mlc.get(Calendar.DATE);
        int month = mlc.get(Calendar.MONTH);
        int yr = mlc.get(Calendar.YEAR);
        String dateStr = day + "." + month + "." + yr;
        System.out.println(dateStr);

        int hour = mlc.get(Calendar.HOUR);
        int min = mlc.get (Calendar.MINUTE);
        int sec = mlc.get (Calendar.SECOND);

        System.out.println(hour+":"+min+":"+sec);

    }

}
