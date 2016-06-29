package com.brainacad.onesterenko.lesson20.synchronization;

/**
 * Created by User on 24.06.2016.
 */
public class UserAccount {
    private int money;
    public UserAccount(int money){
        this.money = money;
    }
    public int get(){
        return money;
    }

    public void set(int money) {
        this.money = money;
    }
}
