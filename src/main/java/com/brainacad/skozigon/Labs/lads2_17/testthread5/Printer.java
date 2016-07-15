package com.brainacad.skozigon.Labs.lads2_17.testthread5;

/**
 * Created by skozigon on 29.06.2016.
 */
public class Printer extends Thread {
    private Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (storage) {
                System.out.println(storage.getI());
                try {
                    storage.wait(60);
                } catch (InterruptedException e) {
                    System.out.println("Printer error");
                }
                storage.notify();
            }
        }
    }

}
