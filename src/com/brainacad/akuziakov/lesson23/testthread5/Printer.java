package com.brainacad.akuziakov.lesson23.testthread5;

public class Printer extends Thread {

    boolean exit=false;

    private final Storage storage;

    public Printer(Storage storage) {
        this.storage = storage;
    }

    public Storage getStorage() {
        return storage;
    }

    @Override
    public void run() {
        while (!exit) {
            synchronized (storage) {
                System.out.println(storage.getVariable());
                exit=storage.isReady();
                storage.notifyAll();
            }
        }
    }
}
