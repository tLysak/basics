package com.brainacad.lpyavka.lesson11.Animals;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnimal {


    public static void main(String[] args) {
        Speakable[] animals = {new SiamCat(300), new SiamCat(100), new Bulldog(100, 2.5), new SiamCat(150), new Bulldog(250, 1.5)};
        for (Speakable animal : animals) {
            animal.doSpeak();
            System.out.println(animal.toString());
        }
        System.out.println("----------------------------------------");
        Speakable[] cats = {new SiamCat(300), new SiamCat(100), new SiamCat(150)};
        Arrays.sort(cats);
        printCats(cats);

        SiamCat[] cats1 = {new SiamCat(400), new SiamCat(900), new SiamCat(150),new SiamCat(200)};
        Arrays.sort(cats1, new SiamCatComparator());
        printCats(cats1);

        SiamCat[] cats2 = {new SiamCat(400), new SiamCat(900), new SiamCat(150),new SiamCat(200)};
        Arrays.sort(cats2,new Comparator<SiamCat>() { //Comparator as anonymous class
            @Override
            public int compare(SiamCat o1, SiamCat o2) {
                return o1.price - o2.price;
            }
        });
        printCats(cats2);
    }

    private static void printCats(Speakable[] cats) {
        for (Speakable cat : cats) {
            System.out.println(cat.toString());
        }
        System.out.println("----------------------------------------");
    }
}


