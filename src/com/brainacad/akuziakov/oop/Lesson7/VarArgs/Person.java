package com.brainacad.akuziakov.oop.Lesson7.VarArgs;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private long salary;

    public Person(final int age) {
        this.age = age;
    }

    public Person(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person initPerson(final String firstName, final String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        return this;
    }

    public Person initPerson(final int age, final long salary){
        this.age=age;
        this.salary=salary;
        return this;
    }

    public Person initPerson(final String lastName, final int age){
        initPerson(null, lastName);
        initPerson(age, 0L);
//        this.lastName=lastName;
//        this.age=age;
        return this;
    }
}
