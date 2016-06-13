package com.brainacad.skozigon.Labs.labs2_14.testgenerics1.testgenerics3;

import java.util.Arrays;

/**
 * Created by skozigon on 13.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Integer[] mas1 = {1,2,3,4,5,6,7,8,9} ;
        String[] mas2 = {"one","two", "three"};
        MyMixer  int_mass = new MyMixer(mas1);
        MyMixer string_mass = new MyMixer(mas2);
        System.out.println(Arrays.toString(int_mass.shuffle()));
        System.out.println(Arrays.toString(string_mass.shuffle()));

//

    }
}
