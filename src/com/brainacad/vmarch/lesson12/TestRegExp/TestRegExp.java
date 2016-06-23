package com.brainacad.vmarch.lesson12.TestRegExp;


//        begin from Uppercase,
//        then other chars in Lowercase
//        and contains only letters.
//        In main() method declare array of String with next values:
//        {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
//        Add code to check each of these values with checkPersonWithRegExp() method and print result to console.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegExp {

    public static boolean checkPersonWithRegExp(String userNameString) {

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{1,}");
        Matcher matcher = pattern.matcher(userNameString);
        boolean res = matcher.matches();
        if (res) {

            System.out.println(userNameString);
        }

        return false;
    }
}
