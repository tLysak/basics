package com.brainacad.vmarch.lesson23.volat;


public class MainVol {


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

    static class ChangeMaker extends Thread {

        @Override
        public void run() {
            int local_value = 0;
            while (!isInterrupted()) {
                local_value = local_value + 1;
                varVlt = local_value;
                varNonVlt = local_value;
            }
        }
    }

    static class ChangeListener extends Thread {

        @Override
        public void run() {
            while (!isInterrupted()) {
                if (varVlt > varNonVlt) {
                    System.out.printf("Error:%s>%s\r\n", varVlt, varNonVlt);
                }
            }
        }
    }
}