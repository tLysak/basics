package com.brainacad.skozigon.lesson21.test;


import java.util.Random;

/**
 * Created by skozigon on 24.06.2016.
 */
public class DataGenerator extends Thread{
    MyTestData dat;

    public DataGenerator(MyTestData dat) {
        this.dat = dat;
    }

    @Override
    public void run() {
        System.out.println("Generating data ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        byte[] data = new byte[1000];
        new Random().nextBytes(data);
        System.out.println("OK!");
        synchronized (dat){
            dat.setData(data);
            dat.notifyAll();
        }
    }
}
