package com.brainacad.onesterenko.lesson12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by user on 01.06.2016.
 */
public class ReExpTest {
    public static void main(String[] args) {

        String testArray[]={"VOVA","Ivan","R2d2","ZX","Anna","12345", " "};
        Matcher m = null;
        Pattern pt = Pattern.compile("([A-Z]){1}([a-zA-Z0-9]){1,}");
       for (int i =0; i<testArray.length;i++) {
                       m = pt.matcher(testArray[i]);
           boolean ft = m.matches();
           System.out.println(testArray[i]+ "  " + ft);
       }

    }
}

