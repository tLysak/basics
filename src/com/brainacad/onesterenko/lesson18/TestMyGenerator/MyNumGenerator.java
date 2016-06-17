package com.brainacad.onesterenko.lesson18.testMyGenerator;

import java.util.*;

/**
 Add to class MyNumGenerator new method “generateDistinct ()” which return new collection (of Set type)
 with numOfElm length and filled with distinct (with no duplicate values) numbers (which generated randomly) from 0 to  maxNumb.
 Create a class Main with a main( ) method.
 Add to method main() code to create instance of MyNumGenerator (for example with 5,64 parameters) and print result
 of invoking generateDistinct () method to console.
 Execute the program.
 The program output must be like next example:
 [5,61,47,2,17]

 */
public class MyNumGenerator {
    int numOfElm;
    int maxNumb;
    final static Random random = new Random();
    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List < Integer> generate (){
        List <Integer> list = new ArrayList<>();
        for (int i=0; i<numOfElm; i++){
            list.add(random.nextInt(10));
        }
        return list;
    }
    public Set< Integer> generateDistinct(){
        Set <Integer> treeSet = new TreeSet<>();
        for (int i=0; i<numOfElm; i++){
            treeSet.add(random.nextInt(10));
        }
        return treeSet;
    }


}
