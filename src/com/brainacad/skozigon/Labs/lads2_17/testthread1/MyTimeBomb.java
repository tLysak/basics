package com.brainacad.skozigon.Labs.lads2_17.testthread1;

import static java.lang.Thread.sleep;

/**
 * Created by skozigon on 22.06.2016.
 */
public class MyTimeBomb implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                sleep((1) * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Boom!!!");
    }
}
