package com.brainacad.akuziakov.lesson19.lab_2_15_3.testcollection3;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i <= 10; i++) {
            arrayList.add(String.format("number+%d", i));
            linkedList.add(String.format("number+%d", i));
        }

        printList(arrayList);

        printList(linkedList);

        ListIterator<String> listIterator = linkedList.listIterator(linkedList.size());
        while(listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
        }

        System.out.println("\ncheck\n");
        printList(arrayList);
    }

    private static void printList(List<String> list) {
        Iterator<String> stringIterator = list.iterator();

        while (stringIterator.hasNext()) {
            System.out.print(stringIterator.next());
        }
        System.out.println();
    }
}
