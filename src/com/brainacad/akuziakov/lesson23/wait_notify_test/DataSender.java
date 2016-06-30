package com.brainacad.akuziakov.lesson23.wait_notify_test;

public class DataSender extends Thread {

    final MyTestData data;
    final String user;

    public DataSender(final MyTestData doc, final String user) {
        this.data = doc;
        this.user = user;
    }

    public void run(){
        System.out.println("Waiting for Data #"+getId()+"...");
        synchronized (data){
            try {
                while (!data.ready()){
                    data.wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            }
        }
        System.out.printf("Sending data to %s\r\n", user);
    }
}
