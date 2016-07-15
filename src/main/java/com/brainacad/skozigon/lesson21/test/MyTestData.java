package com.brainacad.skozigon.lesson21.test;

/**
 * Created by skozigon on 24.06.2016.
 */
public class MyTestData {
    private byte[] data;

    public void setData(byte[] data) {
        this.data = data;
    }
    public boolean ready(){
        return data != null;
    }
}
