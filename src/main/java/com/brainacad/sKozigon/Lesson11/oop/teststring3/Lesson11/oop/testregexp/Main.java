package com.brainacad.skozigon.Lesson11.oop.teststring3.Lesson11.oop.testregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by skozigon on 23.05.2016.
 */

public class Main {

    public static boolean checkPersonWithRegExp(String userNameString){
        String imp = userNameString;
        String emp = "^[A-Z]{1}[a-z]+";
        Pattern pat = Pattern.compile(emp);
        Matcher m = pat.matcher(imp);
        if (m.matches())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String[] string = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat"," "};
        for (int i = 0; i <string.length ; i++) {
            System.out.println(checkPersonWithRegExp(string[i]));
        }

    }
}
