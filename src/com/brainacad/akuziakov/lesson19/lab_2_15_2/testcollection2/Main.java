package com.brainacad.akuziakov.lesson19.lab_2_15_2.testcollection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();

        Random random = new Random();

        int index;
        for (int i = 0; i <= 10; i++) {
            index = Math.abs(random.nextInt(10));
            list.add(index, "number_" + i);
        }

        Iterator<String> stringIterator = list.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
