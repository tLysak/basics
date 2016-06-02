package com.brainacad.onesterenko.lesson14;

/**
 * Created by User on 27.05.2016.
 */
public class MyException extends Throwable {

    public static void MyException() throws Exception {
        throw new Exception("Some shit");
    }
}
