package com.brainacad.skozigon.Lesson6.Lesson6_2;

/**
 * Created by skozigon on 29.04.2016.
 */
public class Person {
    private String firstName, lastName;
    private int age;
    private long salary;

    public Person(int age){
        this.age = age;
    }


    public Person initPerson(final String firstName, final String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        return this;
    }
    public Person initPerson(final int age, final long salary){
        if (age<0){
            System.out.println("Age was not set");
            this.age = 0;
        }
            this.age=age;

        this.salary = salary;
        return this;
    }
    public Person initPerson(final String lastName, final int age){
        this.lastName = lastName;
        this.age = age;
        return this;
    }
}
