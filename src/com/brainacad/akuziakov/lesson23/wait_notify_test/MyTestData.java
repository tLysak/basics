package com.brainacad.akuziakov.lesson23.wait_notify_test;

public class MyTestData {

    private byte[] data;

    public void setData(byte[] data) {
        this.data = data;
    }

    public boolean ready(){
        return null!=data;
    }
}
