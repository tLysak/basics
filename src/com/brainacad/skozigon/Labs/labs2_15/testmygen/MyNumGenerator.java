package com.brainacad.skozigon.Labs.labs2_15.testmygen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by skozigon on 15.06.2016.
 */
public class MyNumGenerator {
    private int numOfElm;
    private int maxNum;

    public MyNumGenerator(int numOfElm, int maxNum) {
        this.numOfElm = numOfElm;
        this.maxNum = maxNum;
    }
    public List generate(){
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < numOfElm; i++) {
            list.add(random.nextInt(maxNum));
        }
        return list;

    }

}
