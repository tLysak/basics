package com.brainacad.agudyma.lesson11.AbstractClasses.interFaces;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by User on 20.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        Speakable[] siamCats = {new SiamCat(1), new SiamCat(2), new SiamCat(3)};
//        Arrays.sort(siamCats, SiamCat);
        for (Speakable SiamCat : siamCats) {

            System.out.println(SiamCat.toString());


        }


    }
}
