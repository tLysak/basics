package com.brainacad.skozigon.Labs.labs2_15.testmap1;

import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * Created by skozigon on 15.06.2016.
 */
public class MyTranslator {
    private HashMap<String, String> dictionary = new HashMap<>();

//    Scanner sc = new Scanner(System.in);
    public void addNewWorld(String en, String ru){
            dictionary.put(en, ru);
    }

    public void translate(String en){
        StringTokenizer str = new StringTokenizer(en, " ");
        while(str.hasMoreElements()){
            System.out.printf(dictionary.get(str.nextToken()) + " ");
        }

    }
}
