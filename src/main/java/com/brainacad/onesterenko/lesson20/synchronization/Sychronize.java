package com.brainacad.onesterenko.lesson20.synchronization;

/**
 * Created by User on 24.06.2016. -100
 */
public class Sychronize {
    public static void main(String[] args) {


        UserAccount acc = new UserAccount(1000);
        for (int i = 0; i < 300; i++) {
            UserAction act = new UserAction(acc, 100);
                act.start();
            };
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(acc.get());
        }
    }

