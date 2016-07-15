package com.brainacad.agudyma.oop.testCollection2;

import java.util.*;

/**
 * Created by Sidhartha on 14.06.2016.
 */
public class Main {
    public static void main(String[] args) {


    List<String> list1 = new ArrayList<>();
    for (int i = 0 ; i < 10; i++             ) {
        list1.add("number_" + i);

    }
    System.out.println(list1);
//        Random random = new Random();
//        int temp = random.nextInt(10);
//        System.out.println(temp);
//        System.out.println("\n");
    Collections.shuffle(list1);
    Iterator<String> array = list1.iterator();
    while(array.hasNext()) {
        String line = array.next();
        System.out.print(line+", ");
    }
//        for (int tmp = 0; tmp < 10;tmp++){
//            int randomIndex = random.nextInt(10);
//            String randomObject1 = list1.get(randomIndex);
////            System.out.println(randomObject1);
//        }



    }



}
