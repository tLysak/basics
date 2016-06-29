package com.brainacad.akuziakov.lesson23.volatile_test;

public class Main {

    private static volatile int varVlt = 0;
    private static int varNonVlt = 0;

    public static void main(String[] args) {
        ChangeListener th1 = new ChangeListener();
        ChangeMaker th2 = new ChangeMaker();
        th1.start();
        th2.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        th1.interrupt();
        th2.interrupt();
    }

    public static class ChangeListener extends Thread {
        @Override
        public void run() {
            while (!isInterrupted()) {
                if (varVlt > varNonVlt) {
                    System.out.printf("Error:%s>%s\r\n", varVlt, varNonVlt);
                }
            }
        }
    }

    public static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int localValue = 0;
            while (!isInterrupted()) {
                localValue = localValue + 1;
                varNonVlt = localValue;
                varVlt = localValue;
            }
        }
    }
}