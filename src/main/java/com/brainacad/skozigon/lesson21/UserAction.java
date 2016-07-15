package com.brainacad.skozigon.lesson21;

/**
 * Created by skozigon on 24.06.2016.
 */
public class UserAction extends Thread {
    private UserAccount acc;
    private int withdraw;
    public UserAction(UserAccount acc, int withdraw){
        this.acc = acc;
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        synchronized (acc) {
            int has = acc.getMoney();
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (has >= withdraw) {
                acc.setMoney(acc.getMoney() - withdraw);
            }
        }
    }
}
