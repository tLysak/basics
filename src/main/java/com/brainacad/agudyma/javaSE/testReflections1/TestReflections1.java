package com.brainacad.agudyma.javaSE.testReflections1;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * Created by User on 7/27/2016.
 */
public class TestReflections1 {



    public static void main(String[] args) {

        User user1 = new User();
        Class class1 = user1.getClass();
        System.out.println(class1);
        Field[] fields = class1.getFields();

        for (Field element:fields
             ) {
            System.out.println(element);

        }



//        System.out.printf("%s , %s, %s, %s", fields);



    }


}
