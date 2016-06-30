package com.brainacad.akuziakov.lesson23.synchonized_block_test;

public class UserAction extends Thread {

    private UserAccount acc;
    private int withdraw;

    public UserAction(final UserAccount acc, final int withdraw) {
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
