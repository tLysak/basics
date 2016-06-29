package com.brainacad.vmarch.lesson23.useraccount;


public class UserAction extends Thread {
    private UserAccount acc;
    private int withdraw;

    public UserAction(UserAccount acc, int withdraw) {
        this.acc = acc;
        this.withdraw = withdraw;


    }

    @Override
    public void run() {
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
