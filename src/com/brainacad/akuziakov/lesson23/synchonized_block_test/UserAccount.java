package com.brainacad.akuziakov.lesson23.synchonized_block_test;

public class UserAccount {

    private int money;

    public UserAccount(final int money) {
        this.money = money;
    }

    public int get() {
        return money;
    }

    public void set(final int money) {
        this.money = money;
    }
}
