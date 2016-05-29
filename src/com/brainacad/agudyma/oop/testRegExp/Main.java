package com.brainacad.agudyma.oop.testRegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sidhartha on 28.05.2016.
 */
public class Main {
//    public String personNames;
//
//    public String ArrayOfNames(String personNames) {
//        this.personNames = personNames;
//        return personNames;
//    }
//
////
//    public static boolean checkPersonWithRegExp() {
//        this.arr1 =arr1;
//        for (String element : arr1) {
//            System.out.println(element);
//
//
//
//        }
//        return true;
//    }


    public static void main(String[] args) {

        String [] arr1 = {"VOVA","Ivan","R2d2","ZX","Anna","12345","ToAd","TomCat", " "};
        String personMName = arr1[1];
        System.out.println(personMName);
        String pattern = "(.*)(\\d+)(.*)";
        Pattern pattern1 = Pattern.compile(pattern);
        Matcher m = pattern1.matcher(personMName);
        System.out.println(pattern1);
        System.out.println(m.matches());
        for (String element:arr1 ){
//            int i;
//            if( arr1[i] )
//            System.out.println(element);
        }
//        System.out.println(checkPersonWithRegExp());
    }


}
