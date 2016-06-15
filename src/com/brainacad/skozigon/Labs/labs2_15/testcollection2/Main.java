package com.brainacad.skozigon.Labs.labs2_15.testcollection2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Created by skozigon on 13.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        List<String> list = new LinkedList<String>();
        Random rnd = new Random();
        for (int i = 0; i <=10 ; i++) {
            String s = "num_";
            list.add(rnd.nextInt(10),s+i);
        }

        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
