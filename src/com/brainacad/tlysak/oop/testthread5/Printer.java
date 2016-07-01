package com.brainacad.tlysak.oop.testthread5;

public class Printer extends Thread {

    private final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }


    @Override
    public void run() {
        while (!isInterrupted()) {
            synchronized (storage) {
                final int counter = storage.getState();
                System.out.println(counter);
                storage.setPrinted(true);
                storage.notifyAll();

                while(counter == storage.getState()) {
                    try {
                        storage.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Printer interrupted");
                        return;
                    }
                }

            }
        }
    }
}
