package com.brainacad.agudyma.oop.testCollection5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 15.06.2016.
 */
public class MyNumGen {
    private int numOfElm;
    private int maxNumb;
    Random random = new Random();

    public MyNumGen(int numOfElm, int maxNumb) {
        this.maxNumb = maxNumb;
        this.numOfElm = numOfElm;
    }



    public void generateArray(){
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < numOfElm;i++ ){
            int randomMaxvalue = random.nextInt(maxNumb);
//            System.out.println(randomMaxvalue);
            randomMaxvalue++;

            list1.add(randomMaxvalue);
        }

        Iterator<Integer> array = list1.iterator();
        while(array.hasNext()) {
            Integer line = array.next();
//            System.out.print(line+", ");
        }
        System.out.println(list1);
    }

}
