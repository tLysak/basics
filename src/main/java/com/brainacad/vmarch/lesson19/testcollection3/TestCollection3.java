package com.brainacad.vmarch.lesson19.testcollection3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestCollection3 {

    public static void main(String[] args) {

        ArrayList<String> listArray = new ArrayList<>();
        LinkedList<String> listLinked = new LinkedList<>();

        int i = 0;
        while (i < 10) {
            listArray.add("numAr_" + i);
            listLinked.add("numLi_" + i);
            i++;
        }


        System.out.println("ArrayList: ");
        Iterator<String> iter1 = listArray.iterator();

        while (iter1.hasNext()) {
            String elemArr = iter1.next();
            System.out.println(elemArr);
        }


        System.out.println("\nLinkedList: ");
        Iterator<String> iter2 = listLinked.iterator();

        while (iter2.hasNext()) {
            String elemLin = iter2.next();
            System.out.println(elemLin);
        }

        int a = 0;
        int b = 9;

        System.out.println("\nRenamed ListArray elements: ");

        while (a < 10) {

            String elemBack = listArray.set(b, listLinked.get(a));
            a++;
            b--;
            System.out.println("new_" + elemBack);

        }
//        ListIterator<String> listIterator = listLinked.listIterator();
//        while(listIterator.hasPrevious()){
//            listArray.add(9,///////////
//
//
//        }
    }
}

