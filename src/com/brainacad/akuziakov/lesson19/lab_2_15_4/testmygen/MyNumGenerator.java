package com.brainacad.akuziakov.lesson19.lab_2_15_4.testmygen;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyNumGenerator {
    private final int numOfElem;
    private final int maxNumb;

    public MyNumGenerator(final int numOfElem, final int maxNumb){
        this.numOfElem=numOfElem;
        this.maxNumb=maxNumb;
    }

    public List<Integer> generate(){
        List<Integer> tList=new LinkedList<>();

        Random random=new Random();

        for (int i=0; i<numOfElem;i++){
            tList.add(i, Math.abs(random.nextInt(maxNumb)));
        }

        return tList;
    }
}
