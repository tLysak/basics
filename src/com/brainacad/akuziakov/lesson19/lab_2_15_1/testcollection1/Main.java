package com.brainacad.akuziakov.lesson19.lab_2_15_1.testcollection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        for (int i = 0; i <= 10; i++) {
            list.add("number_" + i);
        }

        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
