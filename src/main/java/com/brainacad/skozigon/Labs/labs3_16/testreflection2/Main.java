package com.brainacad.skozigon.Labs.labs3_16.testreflection2;

import java.lang.reflect.Field;
import java.util.Arrays;


/**
 * Created by skozigon on 29.07.2016.
 */
public class Main {
    private char[] value;
    public static void main(String[] args) {
        String myStr = "abcd";
        char temp[] = new char[myStr.length()];


        Main m = new Main();



        try {
            Field field = m.getClass().getDeclaredField("value");
            field.setAccessible(true);
            field.set(m, m.initMass(myStr));
            System.out.println("Old string: " + Arrays.toString(m.value));
            myStr = "zxcv";
            field.set(m, m.initMass(myStr));
            System.out.println("New String: " + Arrays.toString(m.value));


        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public char[] initMass(String str){
        char[] temp = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            temp[i] = str.charAt(i);
        }
        return temp;
    }
}
