package com.brainacad.akuziakov.lesson23.testthread5;

public class Main {

    public static final int INITIAL_STATE = 1;

    public static void main(String[] args) {

        Storage storage = new Storage(INITIAL_STATE);
        Counter counter = new Counter(storage);
        Printer printer = new Printer(storage);
        counter.start();
        printer.start();

//        try {
//            Thread.sleep(3 * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //printer.interrupt();
    }
}
