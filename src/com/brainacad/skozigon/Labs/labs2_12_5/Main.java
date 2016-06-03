package com.brainacad.skozigon.Labs.labs2_12_5;

/**
 * Created by skozigon on 03.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyTestClass myTestClass = new MyTestClass();
        MyTestClass.MyStaticNested myStaticNested = new MyTestClass.MyStaticNested();
        MyTestClass.MyInner myInner = myTestClass.new MyInner();

        System.out.println("Accesses the nested classes members from the outer class:");

        myTestClass.test();
        myStaticNested.staticNestedMethod();
        myInner.myLocalMethod();

        System.out.println("Accesses the outer class’s members from within the nested classes:");
        System.out.println("Accesses MyTestClass member from MyStaticNested " + myStaticNested.myTestClassChar);



        myInner.myNextLocalMethod();






    }



}
