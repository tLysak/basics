package com.brainacad.akuziakov.lesson23.wait_notify_test;

import java.util.Random;

public class DataGenerator extends Thread {

    final MyTestData dat;

    public DataGenerator(final MyTestData dat) {
        this.dat = dat;
    }

    public void run() {

        System.out.println("Generating Data...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        byte[] data = new byte[1000];
        new Random().nextBytes(data);
        System.out.println("OK!!!");
        synchronized (dat) {
            dat.setData(data);
            dat.notifyAll();
        }
    }


}
