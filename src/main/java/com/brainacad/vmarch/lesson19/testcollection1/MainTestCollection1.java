package com.brainacad.vmarch.lesson19.testcollection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTestCollection1 {

    public static void main(String[] args) {

        int i = 0;

        List<String> list = new ArrayList<>();

        while (i < 10) {
            list.add("number_" + i);
            i++;
        }

        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String elem = iter.next();
            System.out.println(elem);
        }
    }
}

