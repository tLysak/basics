package com.brainacad.skozigon.Labs.lads2_17.testthread5;

/**
 * Created by skozigon on 29.06.2016.
 */
public class Counter extends Thread {
    private Storage storage;
    private int i = 0;



    public Counter(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (i != storage.coun) {
            synchronized (storage) {
                storage.setI(i++);

                try {
                    storage.wait(60);
                } catch (InterruptedException e) {
                    System.out.println("Counter error");
                }
                storage.notify();
            }
        }

    }
}
