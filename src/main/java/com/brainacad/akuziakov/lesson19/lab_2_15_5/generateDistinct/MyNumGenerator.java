package com.brainacad.akuziakov.lesson19.lab_2_15_5.generateDistinct;

import java.util.*;

public class MyNumGenerator {
    private final int numOfElem;
    private final int maxNumb;
    private final Random random;

    public MyNumGenerator(final int numOfElem, final int maxNumb) {
        this.numOfElem = numOfElem;
        this.maxNumb = maxNumb;
        this.random = new Random();
    }

    public List<Integer> generate() {
        List<Integer> tList = new LinkedList<>();

        for (int i = 0; i < numOfElem; i++) {
            tList.add(Math.abs(random.nextInt(maxNumb)));
        }

        return tList;
    }

    public Set generateDistinct() {

        Set set = new HashSet<>();
        int currentElementIndex = 0;
        int valueToInsert;

        while (currentElementIndex != numOfElem - 1) {

            valueToInsert = Math.abs(random.nextInt(maxNumb));

            if (set.add(valueToInsert)) {
                currentElementIndex++;
            }
        }
        return set;
    }
}
