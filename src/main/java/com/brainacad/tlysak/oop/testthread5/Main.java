package com.brainacad.tlysak.oop.testthread5;

public class Main {

    public static final int INITIAL_STATE = 0;
    public static final int NUMBER_OF_ITERATIONS = 1_000;

    public static void main(String[] args) throws InterruptedException {
        Storage storage = new Storage(INITIAL_STATE);
        Counter counter = new Counter(storage, NUMBER_OF_ITERATIONS);
        Printer printer = new Printer(storage);

        counter.start();
        printer.start();

        try {
            counter.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printer.interrupt();
    }
}