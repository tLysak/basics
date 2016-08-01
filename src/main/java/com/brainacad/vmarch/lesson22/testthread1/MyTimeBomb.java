package com.brainacad.vmarch.lesson22.testthread1;


public class MyTimeBomb extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 10; i > 0; i--) {

                System.out.println(i);
                sleep(1000l);

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        try {
            Thread thr = new MyTimeBomb();

            thr.start();
            sleep(10000l);
            System.out.println("BOOM");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

