package com.brainacad.akuziakov.lesson23.testthread5;

public class Counter extends Thread {
    private final Storage storage;

    public Counter(final Storage counter) {
        this.storage = counter;
    }

    @Override
    public void run() {

        for (int i = 0; i < 1_000_000; i++) {
            storage.setVariable(storage.getVariable() + 1);
            try {
                synchronized (storage){storage.wait();};
                if (1_000_000==i)
                {
                    storage.setReady(true);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
