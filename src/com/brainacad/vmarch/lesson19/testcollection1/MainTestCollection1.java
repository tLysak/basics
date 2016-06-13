package com.brainacad.vmarch.lesson19.testcollection1;

//        Add to method main() code that declares “list” variable (of List type) of string objects as ArrayList<String>.
//        Write code to fill this “list” in loop with string values like: “number_”
//        and number of current iteration (from 0 to 10).
//        Add code which iterates over list and print current element value to console.
//        Execute the program.
//        The program output must be like next example:
//        number_0
//        number_1
//        number_2
//        …
//        number_10

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainTestCollection1 {

    public static void main(String[] args) {

        int i = 0;

        List<String> list = new ArrayList<>();

        while (i < 10) {
            list.add("number_" + i);
            i++;
        }

        Iterator<String> iter = list.iterator();

        while (iter.hasNext()) {
            String elem = iter.next();
            System.out.println(elem);
        }
    }
}

