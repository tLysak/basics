package com.brainacad.skozigon.Labs.lads2_17.testthread1;

/**
 * Created by skozigon on 22.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyTimeBomb bomb = new MyTimeBomb();
        Thread thread = new Thread(bomb);
        thread.start();

    }
}
