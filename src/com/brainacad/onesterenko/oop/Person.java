package com.brainacad.onesterenko.oop;

/**
 * Created by User on 29.04.2016.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long salary;

    public Person(int age){
        this.age = age;
    }

    public Person initPerson(final String firstName, final String lastName) {
        this.firstName =firstName;
        this.lastName = lastName;
        return this;
    }
    public Person initPerson (final int age, final long salary){
        this.age= age;
        this.salary = salary;
        return this;
    }
    public Person initPerson (final String lastName, final int age){
        this.lastName = lastName;
        this.age = age;
        return this;
    }
}

