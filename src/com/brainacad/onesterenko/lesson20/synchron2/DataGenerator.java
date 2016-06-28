package com.brainacad.onesterenko.lesson20.synchron2;

import java.util.Random;

/**
 * Created by User on 24.06.2016.
 */
public class DataGenerator extends Thread {
    MyTestData dat;
    public DataGenerator(MyTestData dat){
        this.dat = dat;
    }
    public void run() {
        System.out.print("Generating Data....");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        byte[] data = new byte[1000];
        new Random().nextBytes(data);
        System.out.println("OK!!!");
        synchronized ( dat){
            dat.setData(data);
            dat.notifyAll();
        }
    }
}
