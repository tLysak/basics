package com.brainacad.tlysak.oop.testthread5;



public class Counter extends Thread {
    private final Storage storage;
    private final int numberOfIterations;

    public Counter(final Storage counter, int numberOfIterations) {
        this.storage = counter;
        this.numberOfIterations = numberOfIterations;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < numberOfIterations; i++) {
                if(i != 0) {
                    storage.setState(storage.getState() + 1);
                }
                try {
                    while(!storage.isPrinted()) {
                        storage.wait();
                    }
                    storage.setPrinted(false);
                    storage.notifyAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}