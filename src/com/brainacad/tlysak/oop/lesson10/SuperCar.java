package com.brainacad.tlysak.oop.lesson10;

import java.util.Arrays;

/**
 * Created by tymur on 5/20/16.
 */
public class SuperCar extends Car {

    @Override
    public void runCar() {
        super.runCar();
        System.out.println("Run " + SuperCar.class.getName());

    }

    public static void main(String[] args) {
        Object[] ob = {new Object(), new Object()};
        Arrays.sort(ob);
        Car ourCar = new SuperCar();
        ourCar.doJob();

    }
}
