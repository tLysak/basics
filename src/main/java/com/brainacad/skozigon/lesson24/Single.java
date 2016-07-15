package com.brainacad.skozigon.lesson24;

/**
 * Created by skozigon on 04.07.2016.
 */
class SingleClass{
    private static SingleClass instance = new SingleClass();
    private SingleClass(){
        System.out.println("this is singleton");
    }

    public static SingleClass getSingle(){
        return instance;
    }

    public void showMessage(){
        System.out.println("HI!");
    }
}

public class Single {
    public static void main(String[] args) {
        SingleClass singleClass = SingleClass.getSingle();
        singleClass.showMessage();



    }
}
