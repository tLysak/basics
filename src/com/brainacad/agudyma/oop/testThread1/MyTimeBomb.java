package com.brainacad.agudyma.oop.testThread1;

/**
 * Created by User on 22.06.2016.
 */
public class MyTimeBomb extends Thread {


    @Override
    public void run(){

        for (int i = 10; i>0; i--){
            System.out.println("Seconds left " + (i-1));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Thread thread1 = new MyTimeBomb();

        thread1.start();

        System.out.println("Countdown started");

        try {
            sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Boom");
    }

}
