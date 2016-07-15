package com.brainacad.skozigon.lesson21.test;

/**
 * Created by skozigon on 24.06.2016.
 */
public class DataSender extends Thread{
    MyTestData data;
    String user;
    public DataSender(MyTestData doc, String user){
        this.data = doc;
        this.user = user;
    }

    @Override
    public void run() {
        System.out.println("Waiting for Data#" + getId() + "...");
        synchronized (data){
            try {
                while (!data.ready()){
                    data.wait();
                }
            } catch (InterruptedException e) {
                return;
            }
        }
        System.out.printf("Sending data to %s \n\r", user);
    }
}
