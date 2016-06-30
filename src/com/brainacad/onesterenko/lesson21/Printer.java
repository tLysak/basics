package com.brainacad.onesterenko.lesson21;

/**
 * Created by User on 29/06/2016.
 */
public class Printer extends Thread {

    public Printer(Storage storage) {
        this.storage = storage;
    }

    private  Storage storage;

    public Printer(Counter counter) {

    }

    @Override
    public void run(){
        System.out.println(storage.getData());
    }
}
