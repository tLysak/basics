package com.brainacad.onesterenko.lesson14.ExceptionDemo;

/**
 * Created by user on 01.06.2016.
 */
public class InvalidException extends RuntimeException{

    public InvalidException(){
        printStackTrace();
        System.out.println("Please set valid age");
    }

}
