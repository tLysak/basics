package com.brainacad.agudyma.lesson11.AbstractClasses.interFaces;

/**
 * Created by User on 20.05.2016.
 */
public abstract class Cat implements Speakable{

    public  int price;

    public abstract  void doSpeak();

    public  Cat (int price ){
//        return getPrice();
    }

    public int getPrice() {
        return price;
    }
}
