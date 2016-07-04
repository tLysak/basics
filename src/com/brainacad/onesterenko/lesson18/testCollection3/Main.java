package com.brainacad.onesterenko.lesson18.testCollection3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Create new project called  TestCollection3.
 Add package “com.brainacad.oop.testcollection3”.
 Create a class MainWrapper1 with a main( ) method.
 Add to method main() code to create both an ArrayList and a LinkedList (of String parameter type), and fill each
 in loop with string values like: “num_” and number of current iteration (from 0 to 10).
 Print each list using an ordinary Iterator, then insert one list into the other by using a ListIterator, inserting
 at every other location.
 Now perform the insertion starting at the end of the first list and moving backward.
 Write a static method “printElements” that uses an Iterator to step through a Collection and print the each element
 value in the container.
 Execute the program.

 */
public class Main {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        List<String> arrayList = new ArrayList<>();

        for (int i =0; i<10; i++){
            String str = "num_" +i;
            arrayList.add(str);
            linkedList.add(str);
        }
        Iterator<String> itr = linkedList.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }
        System.out.println();
        Iterator<String> itr2 = arrayList.iterator();
        while(itr2.hasNext()) {
            String element = itr2.next();
            System.out.print(element + " ");
        }

    }
}
