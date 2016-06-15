package com.brainacad.skozigon.Labs.labs2_15.testcollection1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by skozigon on 13.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i <=10 ; i++) {
            String s = "number_";
            list.add(s+i);
        }

        Iterator<String>itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
