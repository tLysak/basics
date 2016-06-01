package com.brainacad.onesterenko.lesson14.ExceptionDemo;

/**
 * Created by user on 01.06.2016.
 */
public class Person {
    public void setAge(int age) throws InvalidException {
        this.age = age;
        if (age <0) throw new InvalidException();
    }

    private int age;
    private String firstName;
    private String lastName;

}
