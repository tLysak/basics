package com.brainacad.skozigon.Labs.lads2_17.testthread5;

/**
 * Created by skozigon on 29.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        Storage storage = new Storage();
        Counter counter = new Counter(storage);
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
