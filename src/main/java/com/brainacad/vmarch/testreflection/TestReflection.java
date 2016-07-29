package com.brainacad.vmarch.testreflection;

// Write code to discover created object and print all information about fields,
// constructors and methods to console.
//        Execute the program.


import java.lang.reflect.Field;

public class TestReflection {
    private int a;
    public int c;
    final int b = 12;
    protected int d;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public TestReflection(int a) {
        this.a = a;
    }

    public TestReflection(int a, int d) {
        this.a = a;
        this.d = d;
    }

    public static void main(String[] args) {

        TestReflection obj = new TestReflection(10);

        Class myMyClass = obj.getClass();
        System.out.println("Class Name: " + myMyClass.getName());

        Field[] fields1 = myMyClass.getFields();
        for (Field field : fields1) {
            System.out.println("Public fields: " + field);
        }

        Field[] fields2 = myMyClass.getDeclaredFields();
        for (Field field : fields2) {
            System.out.println("All fields: " + field);
        }
    }
}
