package com.brainacad.onesterenko.lesson22;

/**
 * Created by User on 04/07/2016.
 */
public class SingltonTest {
    public static void main(String[] args) {
       // SingleObject obj = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        object.showMessage();

    }
}
