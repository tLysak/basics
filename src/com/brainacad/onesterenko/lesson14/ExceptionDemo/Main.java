package com.brainacad.onesterenko.lesson14.ExceptionDemo;

/**
 * Created by user on 01.06.2016.
 */
public class Main {
    public static void main(String[] args) {
        Person testPerson = new Person();
        try {
            testPerson.setAge(-8);
        } catch (InvalidException e){
            e.printStackTrace();
        }

    }
}
