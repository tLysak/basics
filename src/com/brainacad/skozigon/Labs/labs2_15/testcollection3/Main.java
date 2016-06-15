package com.brainacad.skozigon.Labs.labs2_15.testcollection3;

import java.util.*;

/**
 * Created by skozigon on 13.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i <=10 ; i++) {
            String s = "num_";
            arrayList.add(s+i);
            linkedList.add(s+i);
        }

        System.out.println("Print array list");
        printElement(arrayList);
        System.out.println("\nPrint linked list: ");
        printElement(linkedList);

        Random rnd = new Random();
        int j = rnd.nextInt(arrayList.size()-1);

        for (int i = 0; i <linkedList.size() ; i++) {
            arrayList.add(j,linkedList.get(i));

        }

        System.out.println("\nPrint new array list: ");
        printElement(arrayList);
    }

    public static void printElement(List <String> list){
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println("Element: " + itr.next());
        }
    }
}
