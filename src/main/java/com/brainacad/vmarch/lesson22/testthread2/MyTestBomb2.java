package com.brainacad.vmarch.lesson22.testthread2;
import java.lang.Thread;



public class MyTestBomb2 extends Thread implements Runnable {

@Override
    public void run() {

        try{
            for(int b= 10;b>0; b--){
                System.out.println(b);
                sleep(1000l);
            }

        }catch (InterruptedException e){
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {

        try{

           Thread tr = new MyTestBomb2();
            tr.start();
            sleep(10000l);
            System.out.println("Boom!!!");

       }catch (InterruptedException e) {
           e.printStackTrace();
       }
    }
}


