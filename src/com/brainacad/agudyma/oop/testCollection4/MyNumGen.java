package com.brainacad.agudyma.oop.testCollection4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by User on 15.06.2016.
 */
public class MyNumGen {
    int numOfElm;
    int maxNumb;

    public MyNumGen(int numOfElm, int maxNumb) {
        this.maxNumb =maxNumb;
        this.numOfElm=numOfElm;
    }



    public void generateArray(){
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < numOfElm;i++ ){
            Random random = new Random(maxNumb);
            int randomMaxvalue = random.nextInt();

            list1.add(randomMaxvalue);

        }
//        System.out.println(list1);
        Iterator<Integer> array = list1.iterator();
        while(array.hasNext()) {
            Integer line = array.next();
            System.out.print(line+", ");
        }
//        System.out.println(list1);
    }

}
