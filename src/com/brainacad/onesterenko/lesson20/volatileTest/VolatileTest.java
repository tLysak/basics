package com.brainacad.onesterenko.lesson20.volatileTest;


/**
 * Created by User on 24.06.2016.
 */
public class VolatileTest {
    private static volatile int varVlt =0;
    private static int varNonVlt =0;

    public static void main(String[] args) {
        ChangeMaker.ChangeListener th1 = new ChangeMaker.ChangeListener();
        ChangeMaker th2 = new ChangeMaker();
        th1.start(); th2.start();
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.interrupt();th2.interrupt();

            }

    private static class ChangeMaker extends Thread {
        @Override
        public void run() {
            int local_value = 0;
            while (!isInterrupted()){
                local_value = local_value + 1;
                varVlt = local_value;
                varNonVlt = local_value;
            }
        }
        private static class ChangeListener extends Thread {
            @Override
            public void run() {
                while (!isInterrupted()) {
                if(varVlt>varNonVlt){
                    System.out.printf("Error:%s>%s\r\n",varVlt,varNonVlt);

                }
                }
                }
            }
    }
}

