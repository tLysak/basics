package com.brainacad.skozigon.Labs.labs3_16.testreflection1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by skozigon on 27.07.2016.
 */
public class Main {

    public static void main(String[] args) {
        MyClass c = new MyClass();
        final Class<?> cls = c.getClass();
        System.out.println(cls);

        System.out.println("Modifiers:");

        int mod = cls.getModifiers();
        if (Modifier.isPrivate(mod)) {
            System.out.println("private");
        }
        if (Modifier.isPublic(mod)) {
            System.out.println("public");
        }
        if(Modifier.isStatic(mod)){
            System.out.println("static");
        }
        if(Modifier.isAbstract(mod)){
            System.out.println("abstract");
        }
        if(Modifier.isFinal(mod)){
            System.out.println("final");
        }

        System.out.println("Public fields:");

        Field[] fields = cls.getFields();
        for (Field field: fields) {
            Class<?> fType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fType.getName());
        }

        System.out.println("All fields:");
        fields = cls.getDeclaredFields();
        for (Field field: fields) {
            Class<?> fType = field.getType();
            System.out.println("\tName: " + field.getName());
            System.out.println("\tType: " + fType.getName());
        }

        Constructor<?>[] constructor = cls.getConstructors();
        int i = 0;
        for (Constructor<?> ctr: constructor) {
            System.out.println("Constructor" + (i++)+ ": ");
            Class<?>[] classParams = ctr.getParameterTypes();
            for (Class<?> clasParam:classParams) {
                System.out.println(clasParam.getName() + " ");
            }
            System.out.println();
        }

        try {
            Class<?>[] paramTypes = new Class<?>[]{int.class};
        Constructor<?> ctr = cls.getConstructor(paramTypes);
            MyClass t = (MyClass)ctr.newInstance(1);
            System.out.println("Fields: " + t.getA() + ", " + t.getB() + ", " + t.getC() + ", " + t.getD());

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Methods:");

        Method[] methods = cls.getMethods();
        for (Method method: methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturn type" + method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.print("\tParam types: " );
            for (Class<?> paramType: paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }


    }
}

