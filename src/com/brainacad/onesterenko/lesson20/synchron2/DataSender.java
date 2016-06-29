package com.brainacad.onesterenko.lesson20.synchron2;

/**
 * Created by User on 24.06.2016.
 */
public class DataSender extends Thread{
    MyTestData data;
    String user;
    public DataSender(MyTestData doc, String user ){
        this.data = doc;
        this.user = user;
    }
    public void run(){
        System.out.println("Waiting for data#"+ getId()+ " ");
        synchronized (data){
            try {
                while (!data.ready()){
                    data.wait();
                }
            }catch (InterruptedException e){
                return;
            }
        }
        System.out.printf("Sending data to %s\r\n", user);
    }
}
