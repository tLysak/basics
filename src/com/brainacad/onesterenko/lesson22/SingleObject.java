package com.brainacad.onesterenko.lesson22;

/**
 * Created by User on 04/07/2016.
 */
public class SingleObject {
   private static SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getInstance(){
        return instance;
    }


    public void showMessage(){
        System.out.println("Something");
    }
}
