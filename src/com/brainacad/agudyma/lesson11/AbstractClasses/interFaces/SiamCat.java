package com.brainacad.agudyma.lesson11.AbstractClasses.interFaces;

/**
 * Created by User on 20.05.2016.
 */
public class SiamCat extends Cat{
    public int price;
    public  SiamCat (int price){
        super(1);
        this.price = price;

    }
    @Override
    public  void doSpeak(){
        System.out.println("Speak like Siamese cat");

    }

    @Override
    public int getPrice() {
        return price;
    }
}

