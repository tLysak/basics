package com.brainacad.onesterenko.lesson21;

/**
 * Created by User on 29/06/2016.
 */
public class Counter extends Thread {

    public Counter(int counter) {
        this.counter = counter;
    }

    private int counter;

    public Counter( Storage s) {

    }

    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }

@Override
    public void run(){

    for (int i=0;i<1000000;i++){
        counter++;
    }
}
}
