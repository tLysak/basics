package com.brainacad.vmarch.lesson19.testcollection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class MainTestCollection2 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        int i = 0;

        Random random = new Random();
        random.nextInt(9);

        while (i < 10) {

            list.add("num_" + random.nextInt(9));
            System.out.println();
            i++;
        }

        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {

            String el = iter.next();
            System.out.println(el);

        }
    }
}

