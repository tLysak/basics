package com.brainacad.agudyma.javaSE.testAnnotation;

/**
 * Created by User on 8/1/2016.
 */
public class Car {
    int speed;
    public Car (int speed){
        this.speed = speed;
    }
    @Log(filename = "speed.log")
    public int getSpeed() {
        return speed;
    }
}
