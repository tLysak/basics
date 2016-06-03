package com.brainacad.agudyma.oop.testRegExp;

import java.util.Arrays;
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
////
//////
//    public static boolean checkPersonWithRegExp() {
//        this.arr1 =arr1;
//        for (String element : arr1) {
//            System.out.println(element);
////
////
//
//        }
//        return true;
////    }


    public static void main(String[] args) {

        String[] arr1 = {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};

        System.out.println(Arrays.toString(arr1));

//        for (String element : arr1) {
            for (int i = 0; i < arr1.length; i++) {
                String personName = arr1[i];
//                System.out.println(personName);
                String pattern = "(^[A-Z][a-z]+$)";
                Pattern pattern1 = Pattern.compile(pattern);
                Matcher m = pattern1.matcher(personName);
                if (m.matches()) {
                    System.out.println(personName);
                }
//                System.out.println(m.matches());


        }
    }
}

