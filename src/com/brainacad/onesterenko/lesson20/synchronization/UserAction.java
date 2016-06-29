package com.brainacad.onesterenko.lesson20.synchronization;

/**
 * Created by User on 24.06.2016.
 */
public class UserAction extends Thread {
    private UserAccount acc;
    private int withdraw;

    public UserAction(UserAccount acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;
    }

    public void run() {
        synchronized (acc) {
            int has = acc.get();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (has >= withdraw) {
                acc.set(acc.get() - withdraw);
            }
        }
    }
}