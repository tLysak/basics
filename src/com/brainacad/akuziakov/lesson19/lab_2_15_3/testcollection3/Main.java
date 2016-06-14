package com.brainacad.akuziakov.lesson19.lab_2_15_3.testcollection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {
            arrayList.add(i, String.format("number+%d", i));
            linkedList.add(i, String.format("number+%d", i));
        }

        printList(arrayList);

        printList(linkedList);

        for (int i = linkedList.size()-1; i > 0; i--) {
            arrayList.add(linkedList.get(i));
        }

        System.out.println("\ncheck\n");
        printList(arrayList);
    }

    private static void printList(List<String> list) {
        Iterator<String> stringIterator = list.iterator();

        while (stringIterator.hasNext()) {
            System.out.println(stringIterator.next());
        }
    }
}
