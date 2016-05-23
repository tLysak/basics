package com.brainacad.tlysak.oop.lesson10;

/**
 * Created by tymur on 5/20/16.
 */
public abstract  class Car {

    public void doJob() {
        System.out.println("we are in method doJob() class Car");
        runCar();
    }

    public void runCar() {
        System.out.println("Run " + Car.class.getName());
    }
}
