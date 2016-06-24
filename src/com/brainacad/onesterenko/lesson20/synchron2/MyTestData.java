package com.brainacad.onesterenko.lesson20.synchron2;

/**
 * Created by User on 24.06.2016.
 */
public class MyTestData {
    private byte [] data;
    public void setData(byte[] data) {
        this.data = data;
    }
    public boolean ready (){
        return data != null;
    }


}
