package com.brainacad.vmarch.lesson12.TestRegExp;

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
