package com.brainacad.agudyma.oop.testCollections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 13.06.2016.
 */
public class Main  {

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<>();
        for (int i = 0 ; i < 10; i++             ) {
            list1.add("number_" + i);

        }
        System.out.println(list1);
        Iterator<String> array = list1.iterator();
        while(array.hasNext()){
            String line = array.next();


            System.out.println(line);
        }
    }
}

