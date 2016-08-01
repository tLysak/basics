package com.brainacad.agudyma.javaSE.testAnnotation;

import java.lang.reflect.Method;

/**
 * Created by User on 8/1/2016.
 */
public class Process {

    public Process(Car car1, User car2) {

    }

    public static void process(Object o){


        Class<?> classes = Process.class;
        Method [] methods = classes.getDeclaredMethods();
        for (Method userMethod:methods ){
            System.out.println(userMethod);
            if(userMethod.isAnnotationPresent(Log.class)){
                Log m1  = userMethod.getAnnotation(Log.class);
                System.out.println(userMethod.getName() + "->" + m1.filename());
            }
        }



    }
}
