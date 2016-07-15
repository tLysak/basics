package com.brainacad.skozigon.lesson22;

/**
 * Created by skozigon on 01.07.2016.
 */
public class SimpleDeadLock {
    public static Object obj1 = new Object();
    public static Object obj2 = new Object();

    public static void main(String[] args) {
        Thread th1 = new Thread1();
        Thread th2 = new Thread2();
        th1.start();
        th2.start();
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (obj1) {
                System.out.println("Thread1: Holding lock 1 & lock2...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread1: Waiting for lock 2");
                synchronized (obj2) {
                    System.out.println("Thread2: Holding lock 1 & 2...");
                }
            }
        }
    }

    private static class Thread2 extends Thread {
        public void run() {
            synchronized (obj2) {
                System.out.println("Thread2: Holding lock2...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                }
                System.out.println("Thread2: Waiting for lock 1");
                synchronized (obj1) {
                    System.out.println("Thread2: Holding lock 2 & 1...");
                }

            }
        }
    }
}

